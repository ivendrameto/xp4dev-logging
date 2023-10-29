package dev.xp4.article.tasks.mask;

import lombok.extern.slf4j.Slf4j;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PingDataMaskTask {

    @Scheduled(cron = "0 0/1 * * * *")
    public void pingOneMinute() {
        log.info("valor: 123.456.789-01");
        log.info("valor: 12.345.678/0001-09");
        log.info("valor: xpto@gmail.com");
        log.info("valor: xpto@gmail.com.br");
    }

}
