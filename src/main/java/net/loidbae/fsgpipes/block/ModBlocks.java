package net.loidbae.fsgpipes.block;

import java.util.function.Supplier;

import net.loidbae.fsgpipes.FSGPipes;
import net.loidbae.fsgpipes.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            // Register new Blocks 
            DeferredRegister.create(ForgeRegistries.BLOCKS, FSGPipes.MOD_ID);


    public static final RegistryObject<Block> WOOD_PIPE_BLOCK = registerBlock("wood_pipe_block",
    ()-> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));


    // Helper function
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    // Helper function: creates an item for the block
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
    
}
