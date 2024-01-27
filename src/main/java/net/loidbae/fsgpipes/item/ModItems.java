package net.loidbae.fsgpipes.item;

import net.loidbae.fsgpipes.FSGPipes;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            // Register new items
            DeferredRegister.create(ForgeRegistries.ITEMS, FSGPipes.MOD_ID);

    // public static final RegistryObject<Item> WOOD_PIPE = ITEMS.register("wood_pipe", () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
