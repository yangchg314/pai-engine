package code.chg.pai.engine.message.service;

import code.chg.pai.engine.message.domain.topic.entity.Topic;

import java.util.List;
import java.util.function.Predicate;

public abstract class  AbstractTopicAwareSystem<C> {
   List<Topic> topicList;

   abstract List<Topic> filterBy(Predicate<? super C> predicate);

}
