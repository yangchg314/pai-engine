package code.chg.pai.engine.message.domain.topic;

import code.chg.pai.engine.message.entity.TopicType;

import java.util.List;
import java.util.Map;

public interface MessageEvent {
    Map<String,Object> getEventDetail();
    TopicType needTopicType();
}
