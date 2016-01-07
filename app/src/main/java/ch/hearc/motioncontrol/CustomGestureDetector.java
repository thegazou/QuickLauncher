package ch.hearc.motioncontrol;

import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by horia_000 on 07-Jan-16.
 */
public class CustomGestureDetector extends android.view.GestureDetector.SimpleOnGestureListener {

    /**
     * TODO - On Down
     * @param motionEvent
     * @return
     */
    @Override
    public boolean onDown(MotionEvent motionEvent) {
        // Return true, otherwise the system may ignore remaining gesture events.
        return true;
    }

    /**
     * TODO - OnFling
     * @param motionEvent
     * @param motionEvent1
     * @param vX
     * @param vY
     * @return
     */
    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float vX, float vY) {
        Log.d("gestures", "onFling: " + motionEvent.toString() + motionEvent1.toString());

        return true;
    }

}
