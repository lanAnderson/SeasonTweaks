package club.iananderson.seasontweaks.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {


    //Config Builder
    public static final ForgeConfigSpec GENERAL_SPEC;

    static {
        ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
        setupConfig(BUILDER);
        GENERAL_SPEC = BUILDER.build();
    }

    public static ForgeConfigSpec.BooleanValue disableTropicalSeasons;


    private static void setupConfig(ForgeConfigSpec.Builder BUILDER){
        BUILDER.push("Configs for SeasonTweaks");
        BUILDER.push("HUD:");

        disableTropicalSeasons = BUILDER
                .comment("Disable Tropical Seasons? " +
                        "\n This will make tropical biomes (i.e. Jungles, Deserts) follow normal biome rules for" +
                        "\n seasonal weather and crop fertility" +
                        "Default is true")
                .define("disable_tropical_seasons",true);


        BUILDER.pop();
        BUILDER.pop();
    }

    public static void setDisableTropicalSeasons(boolean disable) {
        Config.disableTropicalSeasons.set(disable);
    }
}
