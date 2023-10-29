package dev.xp4.article.tasks.warn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PingWarnTask {

    @Scheduled(cron = "0 0/1 * * * *")
    public void pingOneMinute() {
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }

}
