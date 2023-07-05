package me.adversing.engine.utils.time.countdown;

import lombok.NonNull;
import me.adversing.engine.utils.time.countdown.action.CountdownAction;

import java.util.StringJoiner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * This class represents a countdown. It uses the {@link Timer} class to countdown. It is used in the {@link me.adversing.engine.logic.Choice} class.
 */
public class Countdown {

    private final Timer timer;
    private final CountdownAction action;

    /**
     * Creates a new countdown.
     *
     * @param seconds The seconds to countdown.
     * @param action  The action to execute when the countdown is over. This is an interface because the action can be anything.
     */
    public Countdown(int seconds, @NonNull CountdownAction action) {
        assert seconds > 0 : "The seconds must be greater than 0.";
        this.action = action;
        timer = new Timer();
        timer.schedule(new CountdownTask(), seconds * 1000L);
    }

    class CountdownTask extends TimerTask {

        @Override
        public void run() {
            timer.cancel();
            action.execute();
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Countdown.class.getSimpleName() + "[", "]")
                .add("timer=" + timer)
                .add("action=" + action)
                .toString();
    }
}
