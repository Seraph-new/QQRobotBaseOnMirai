package lrk.bot.core.data.messagetype;

import com.google.gson.JsonObject;

//文件消息

@SuppressWarnings("unused")
public class File extends Message {
    private final String type = "File";
    private final int id;
    private final String name;
    private final int size;

    public File(int id, String name, int size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        JsonObject data = new JsonObject();
        data.addProperty("type", type);
        data.addProperty("id", id);
        data.addProperty("name", name);
        data.addProperty("size", size);
        return data.toString();
    }


    @Override
    public JsonObject toJsonObject() {
        JsonObject data = new JsonObject();
        data.addProperty("type", type);
        data.addProperty("id", id);
        data.addProperty("name", name);
        data.addProperty("size", size);
        return data;
    }


}
