package club.iananderson.seasontweaks.mixin;

import club.iananderson.seasontweaks.config.Config;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import sereneseasons.config.BiomeConfig;

@Mixin(BiomeConfig.class)
public class tropicalBiomes {

    @Inject(
            at = @At("HEAD"),
            method = "usesTropicalSeasons(Lnet/minecraft/util/RegistryKey;)Z",
            cancellable = true,
            remap = false
    )

    private static void usesTropicalSeasons(RegistryKey<Biome> key, CallbackInfoReturnable<Boolean> callback){
        if(Config.disableTropicalSeasons.get()){
            callback.setReturnValue(false);
        }
    }


}
