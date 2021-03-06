package lrk.mirairobot.main;

import lrk.mirairobot.core.event.*;
import lrk.mirairobot.core.listener.*;
import lrk.mirairobot.utils.*;
import lrk.mirairobot.core.data.*;
import lrk.mirairobot.main.threads.GroupMessageThread;
import lrk.mirairobot.main.threads.FriendMessageThread;
import lrk.mirairobot.main.RobotNotification;
import java.io.*;
import java.util.*;
public class RobotMain implements Listener {
	public static String Name = "RobotTester";

    @EventHandler
    public void onEvent(Event event) {
        RobotNotification.Info("新事件:(" + event.getParams()+")");
    }

    @EventHandler
    public void onFriendMessage(FriendMessageEvent event) throws IOException {
    	new FriendMessageThread(event).run();
    }
    @EventHandler
    public void onGroupMessage(GroupMessageEvent event) throws IOException {
    	new GroupMessageThread(event).run();
	}
	
}
