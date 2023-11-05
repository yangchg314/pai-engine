package code.chg.pai.engine.message.domain.topic;

import code.chg.pai.engine.message.domain.topic.entity.Topic;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface MessageTopic {
    // topic 查询服务
    public Optional<Topic> queryTopicByIdentity(String topicIdentity);

    public List<Topic> queryTopic(String appName, String topicType);

    public List<Topic> queryTopicByAppName(String appName);

    public List<Topic> queryTopicByUserId(BigInteger id);

    public Optional<List<Topic>> topicFilterByCondition(List<Topic> topics,MessageEvent messageEvent);

}

