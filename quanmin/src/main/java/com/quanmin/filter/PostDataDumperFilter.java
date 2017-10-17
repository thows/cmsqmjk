package com.quanmin.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.*;

public final class PostDataDumperFilter implements Filter {

    private FilterConfig filterConfig=null;

    @Override
    public void destroy() {
        this.filterConfig=null;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (filterConfig == null) {
            return;
        }

        Enumeration names=request.getParameterNames();
        StringBuffer output=new StringBuffer();
        while (names.hasMoreElements()) {
            String name=(String) names.nextElement();
            output.append(name + "=");
            String values[]=request.getParameterValues(name);
            for (int i=0; i < values.length; i++) {
                if (i > 0) {
                    output.append("' ");
                }
                output.append(values[i]);
            }
            if (names.hasMoreElements()) {
                output.append("&");
            }
        }
        request.setAttribute("post", output);
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig=filterConfig;
    }
}
