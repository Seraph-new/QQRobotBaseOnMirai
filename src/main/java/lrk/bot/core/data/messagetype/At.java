package lrk.bot.core.data.messagetype;

import com.google.gson.*;

//@消息

@SuppressWarnings("unused")
public class At extends Message{
	private final String type = "At";
    private final long target;//要@的目标
	private final String display;//@的文本(名字),做为发送消息时无效
	
	public At(long target,String display){
		this.target = target;
		this.display = display;
	}
	
	public long getTarget(){
		return target;
	}
	
	public String getDisplay(){
		return display;
	}
	
	@Override
	public String toString(){
		JsonObject data = new JsonObject();
		data.addProperty("type",type);
		data.addProperty("target",target);
		data.addProperty("display",display);
		return data.toString();
	}
	
	public JsonObject toJsonObject(){
		JsonObject data = new JsonObject();
		data.addProperty("type",type);
		data.addProperty("target",target);
		data.addProperty("display",display);
		return data;
	}
	
}