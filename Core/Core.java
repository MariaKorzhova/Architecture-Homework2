package Core;

import java.util.*;
import Abstractions.ItemGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Silver.SilverGenerator;
import Rewards.Copper.CopperGenerator;


public class Core {
    // Логика игры
    public void run() {
        List<ItemGenerator> generatorList = new ArrayList<>();

        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new CopperGenerator());
        

        ItemGenerator myGenerator = generatorList.get(new Random().nextInt(generatorList.size()));
        System.out.println(myGenerator.openReward());
    }
}
