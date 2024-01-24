package net.loidbae.fsgpipes.item;

import net.loidbae.fsgpipes.FSGPipes;
import net.loidbae.fsgpipes.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FSGPipes.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FSGPIPES_TAB = CREATIVE_MODE_TABS.register("fsgpipes_tab",
    ()-> CreativeModeTab.builder()
        .icon(() -> new ItemStack(ModItems.WOOD_PIPE.get()))
        .title(Component.translatable("creativetab.fsgpipes_tab"))
        .displayItems((pParameters, pOutput) -> {
            // Add mod items to creative tab here
            pOutput.accept(ModItems.WOOD_PIPE.get());
            pOutput.accept(ModItems.IRON_PIPE.get());
            pOutput.accept(ModBlocks.WOOD_PIPE_BLOCK.get());
        })
        .build());




    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

