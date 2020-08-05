package edu.freedom.utopia.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Description 定时任务
 * @Author: lihj
 * @Date: 2020/7/31 4:17 下午
 */

@Component
public class ScheduledTask {
    private Logger log = LoggerFactory.getLogger(ScheduledTask.class);
    @Scheduled( fixedRate= 60000)
    public void harassInfo(){
        Thread.currentThread().setName("骚扰线程");
//        log.info("**************************************************就烦你,你能拿我怎么样,气死你**************************************************");
//        log.info("**************************************************就烦你,你能拿我怎么样,气死你**************************************************");
//        log.info("**************************************************就烦你,你能拿我怎么样,气死你**************************************************");
//        log.info("**************************************************就烦你,你能拿我怎么样,气死你**************************************************");
//        log.info("**************************************************就烦你,你能拿我怎么样,气死你**************************************************");
    }
//    @Scheduled(cron = "" )
    public void productionData(){
        Thread.currentThread().setName("生产数据线程");

    }


}
