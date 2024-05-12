package dev.blsalin.dic;

import java.util.Map;
import java.util.function.Function;

public class CustomContainerImpl implements CustomContainer {
    @Override
    public <T> boolean addInstance(T instance) {
        return false;
    }

    @Override
    public <T> boolean addInstance(T instance, String customName) {
        return false;
    }

    @Override
    public <T> T getInstance(Class<T> type) {
        return null;
    }

    @Override
    public <T> T getInstance(Class<T> type, String customName) {
        return null;
    }

    @Override
    public <T> boolean addFactoryMethod(Class<T> type, Function<CustomContainer, T> factoryMethod) {
        return false;
    }

    @Override
    public <T> T create(Class<T> type) {
        return null;
    }

    @Override
    public <T> T create(Class<T> type, Map<String, Object> parameters) {
        return null;
    }

    @Override
    public void close() throws Exception {

    }
}
