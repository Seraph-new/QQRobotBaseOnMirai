package lrk.bot.core.event;

import lrk.bot.core.BotCore;
import com.google.gson.JsonObject;

public abstract class Event {
    private final BotCore botCore;
    private final JsonObject params;
    private boolean cancelled;

    public Event(BotCore botCore, JsonObject params) {
        this.botCore = botCore;
        this.params = params;
        cancelled = false;
    }

    public BotCore getBotCore() {
        return botCore;
    }

    public JsonObject getParams() {
        return params;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
