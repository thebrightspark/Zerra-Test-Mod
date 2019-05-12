package brightspark.testmodz

import com.zerra.api.mod.Mod
import com.zerra.api.mod.ModInit
import com.zerra.api.mod.info.ModInfo
import com.zerra.api.mod.info.ModInfoBuilder
import com.zerra.common.Reference
import com.zerra.common.world.item.Item

class Main : Mod {
    override val modInfo: ModInfo
        get() = ModInfoBuilder("testmodz", "Test Mod", "1.3.3.7", Reference.VERSION).build()

    override fun init(modInit: ModInit) {
        logger.info("Hey, listen!")
        modInit.registerItem(Item("lightbulb"))
    }

    override fun postInit() {

    }
}