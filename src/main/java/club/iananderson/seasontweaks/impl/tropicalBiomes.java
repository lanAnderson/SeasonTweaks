package club.iananderson.seasontweaks.impl;

import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import sereneseasons.handler.season.SeasonHandler;

public class tropicalBiomes extends SeasonHandler {

    @Override
    public boolean usesTropicalSeasons(Holder<Biome> biome){
        return false;
    }


}
