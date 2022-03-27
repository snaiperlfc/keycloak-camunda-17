package org.niitp.conf.plugin;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Component;

/**
 * In this listener you can do basically everything. You could also implement it as
 * Spring bean an e.g. send events via Kafka to a central monitor - or to call the ELK stack
 * to hand over some events.
 */
@Component
@Slf4j
public class SendEventListener implements ExecutionListener {

    @Override
    public void notify(DelegateExecution execution) {
        System.out.println("There was an event '" + execution.getEventName() + "'! It came from activity '" +
                execution.getCurrentActivityId() + "' for process instance '" + execution.getProcessInstanceId() + "'");
    }

}
