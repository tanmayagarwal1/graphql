package com.uhg.gpd.ole.resolvers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class TotalResolver {
    public static ArrayList<Integer> resolver(ArrayList<HashMap<String, Object>> list){
        int Grand_total = list.size(), total_2021 = 0, total_2022 = 0, total_Aarp = 0, total_Aarp_2021 = 0, total_Aarp_2022 = 0;
        int total_Uhc = 0, total_Uhc_2021 = 0, total_Uhc_2022 = 0;
        int total_Uhccp = 0, total_Uhccp_2021 = 0, total_Uhccp_2022 = 0;
        ArrayList<Integer> output = new ArrayList<>();
        for(HashMap<String, Object> map : list){
            String plan = (String) map.get("PLAN_TYPE");
            String year = (String) map.get("PLAN_YEAR");
            String site = (String) map.get("SITE_ID");
            if(Objects.equals(year, "2021")){
                total_2021 ++;
                if(Objects.equals(site, "aarp")){
                    total_Aarp ++;
                    total_Aarp_2021 ++;
                }
                if(Objects.equals(site, "uhc")){
                    total_Uhc ++;
                    total_Uhc_2021 ++;
                }
                if(Objects.equals(site, "uhccp")){
                    total_Uhccp ++;
                    total_Uhccp_2021 ++;
                }
            }
            if(Objects.equals(year, "2022")){
                total_2022 ++;
                if(Objects.equals(site, "aarp")){
                    total_Aarp ++;
                    total_Aarp_2022 ++;
                }
                if(Objects.equals(site, "uhc")){
                    total_Uhc ++;
                    total_Uhc_2022 ++;
                }
                if(Objects.equals(site, "uhccp")){
                    total_Uhccp ++;
                    total_Uhccp_2022 ++;
                }
            }
        }
        output.add(Grand_total);
        output.add(total_2021);
        output.add(total_2022);
        output.add(total_Aarp);
        output.add(total_Aarp_2021);
        output.add(total_Aarp_2022);
        output.add(total_Uhc);
        output.add(total_Uhc_2021);
        output.add(total_Uhc_2022);
        output.add(total_Uhccp);
        output.add(total_Uhccp_2021);
        output.add(total_Uhccp_2022);
        return output;
    }
}
