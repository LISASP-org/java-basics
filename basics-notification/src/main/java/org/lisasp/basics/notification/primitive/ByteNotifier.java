package org.lisasp.basics.notification.primitive;

import lombok.Synchronized;

import java.util.ArrayList;
import java.util.List;

public class ByteNotifier implements ByteListener {

    private final List<ByteListener> dataListeners = new ArrayList<>();

    @Override
    @Synchronized("dataListeners")
    public void accept(byte event) {
        dataListeners.forEach(dl -> dl.accept(event));
    }

    @Synchronized("dataListeners")
    public void register(ByteListener dataListener) {
        dataListeners.add(dataListener);
    }
}
