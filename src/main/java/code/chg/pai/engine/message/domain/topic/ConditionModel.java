package code.chg.pai.engine.message.domain.topic;

@FunctionalInterface
public interface ConditionModel {
    boolean satisfy(Object object);
}
