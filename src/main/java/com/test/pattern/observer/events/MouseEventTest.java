package com.test.pattern.observer.events;

import com.test.pattern.observer.events.mouseevent.Mouse;
import com.test.pattern.observer.events.mouseevent.MouseEventCallback;
import com.test.pattern.observer.events.mouseevent.MouseEventType;

/**
 * Created by zhangsan on 2021/5/17.
 */
public class MouseEventTest {
    public static void main(String[] args) {

        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();

        //@谁？  @回调方法
        mouse.addLisenter(MouseEventType.ON_CLICK,callback);
        mouse.addLisenter(MouseEventType.ON_FOCUS,callback);

        mouse.click();

        mouse.focus();


    }
}
