package brightspark.testmodz

import com.zerra.common.event.Event
import com.zerra.common.event.impl.KeyInputEvent
import com.zerra.common.util.Logging

object EventHandler: Logging() {
    @Event
    fun onKeyEvent(event: KeyInputEvent) = info("Key: ${event.keyCode}")
}