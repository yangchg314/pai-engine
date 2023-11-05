package code.chg.pai.engine.message.domain.topic;

import code.chg.pai.engine.message.domain.topic.MessageEvent;
import code.chg.pai.engine.message.entity.TopicType;

import java.util.List;
import java.util.Map;

public class TrafficCollectionMessageEvent implements MessageEvent {
    String dataId;
    List<String> tags;
    Map<String,String> BizInfoMap;


    @Override
    public Map<String, Object> getEventDetail() {
        return null;
    }

    @Override
    public TopicType needTopicType() {
        return TopicType.TASK;
    }
}
