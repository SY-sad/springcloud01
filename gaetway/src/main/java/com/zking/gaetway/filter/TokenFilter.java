package com.zking.gaetway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

public class TokenFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String jwt=request.getParameter("jwt");//请求头

        if(null!=jwt && !"".equals(jwt.trim())){
            ctx.setSendZuulResponse(true); //对请求进行路由
            ctx.setResponseStatusCode(200);
            ctx.set("isSuccess", true);
        }else {
            ctx.setSendZuulResponse(false); //不对其进行路由
            ctx.setResponseStatusCode(500);
            ctx.setResponseBody("shixiao");
            ctx.set("isSuccess", false);

        }
        return null;
    }
}
