package code.chg.pai.engine.message.domain.topic;

import code.chg.pai.engine.message.domain.topic.entity.Topic;

public interface MessageHit {
    // 事件是否命中topic
    default  boolean hit(MessageEvent messageEvent, TopicCondition topicCondition) {
        ConditionModelConfiguration conditionModelConfiguration=topicCondition.buildConditionModelConfiguration();
        return conditionModelConfiguration.satisfy(messageEvent.getEventDetail());
    }
}
