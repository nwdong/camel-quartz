package nwdong.camelquartz;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DemoRoute extends RouteBuilder{

    @Override
    public void configure() throws Exception {
        from("quartz://groupName/timerName?cron=0/2+*+*+*+*+?")
            .log(LoggingLevel.INFO, log, "heartbeats ... ");
    }
    
}
