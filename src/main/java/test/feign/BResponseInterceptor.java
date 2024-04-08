package test.feign;

import feign.InvocationContext;
import feign.Response;
import feign.ResponseInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BResponseInterceptor implements ResponseInterceptor {

    private static final Logger LOG = LoggerFactory.getLogger(BResponseInterceptor.class);

    @Override
    public Object intercept(InvocationContext invocationContext, Chain chain) throws Exception {
        Response response = invocationContext.response();
        LOG.info("BResponseInterceptor called");
        return invocationContext.proceed();
    }
    
}
