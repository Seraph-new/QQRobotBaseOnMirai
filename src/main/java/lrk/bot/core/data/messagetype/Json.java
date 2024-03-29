package lrk.bot.core.data.messagetype;

import com.google.gson.JsonObject;

//Json卡片消息

@SuppressWarnings("unused")
public class Json extends Message {
	private final String type = "Json";
    private final String json;

	public Json(String json) {
		this.json = json;
	}
	
	public String getJson() {
		return json;
	}

	@Override
	public String toString() {
		JsonObject data = new JsonObject();
		data.addProperty("json",json);
		return data.toString();
	}

	@Override
	public JsonObject toJsonObject() {
		JsonObject data = new JsonObject();
		data.addProperty("json",json);
		return data;
	}
	
	
}
