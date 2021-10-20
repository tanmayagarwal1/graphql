package com.uhg.gpd.ole.resolvers;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Resolvers {
    public static ArrayList<Integer> DSNPresolver(ArrayList<HashMap<String, Object>> list) {
        int total_SNP = 0, total_SNP_2021 = 0, total_SNP_2022 = 0, total_Aarp_SNP = 0, total_Aarp_SNP_2021 = 0, total_Aarp_SNP_2022 = 0, total_Uhc_SNP = 0, total_Uhc_SNP_2021 = 0, total_Uhc_SNP_2022 = 0, total_Uhccp_SNP = 0, total_Uhccp_SNP_2021 = 0, total_Uhccp_SNP_2022 = 0;
        ArrayList<Integer> output = new ArrayList<Integer>();
        String[] SNPplans = {"SNP", "DSNP", "CSNPStandard"};
        for (HashMap<String, Object> map : list) {
            String plan = (String) map.get("PLAN_TYPE");
            String year = (String) map.get("PLAN_YEAR");
            String site = (String) map.get("SITE_ID");
            if (Arrays.asList(SNPplans).contains(plan)){
                total_SNP ++;
                if(Objects.equals(year, "2021")){
                    total_SNP_2021 ++ ;
                    if(Objects.equals(site, "aarp")){
                        total_Aarp_SNP ++;
                        total_Aarp_SNP_2021++;
                    }
                    if(Objects.equals(site, "uhc")){
                        total_Uhc_SNP ++;
                        total_Uhc_SNP_2021 ++ ;
                    }
                    if(Objects.equals(site, "uhccp")){
                        total_Uhccp_SNP ++;
                        total_Uhccp_SNP_2021 ++;
                    }

                }

                if(Objects.equals(year, 2022)){
                    total_SNP_2022 ++;
                    if(Objects.equals(site, "aarp")){
                        total_Aarp_SNP ++;
                        total_Aarp_SNP_2022 ++;
                    }

                    if(Objects.equals(site, "uhc")){
                        total_Uhc_SNP ++;
                        total_Uhc_SNP_2022 ++;
                    }

                    if(Objects.equals(site, "uhccp")){
                        total_Uhccp_SNP ++;
                        total_Uhccp_SNP_2022 ++;
                    }
                }
            }
        } // for loop ends
        output.add(total_SNP);
        output.add(total_SNP_2021);
        output.add(total_SNP_2022);
        output.add(total_Aarp_SNP);
        output.add(total_Aarp_SNP_2021);
        output.add(total_Aarp_SNP_2022);
        output.add(total_Uhc_SNP);
        output.add(total_Uhc_SNP_2021);
        output.add(total_Uhc_SNP_2022);
        output.add(total_Uhccp_SNP);
        output.add(total_Uhccp_SNP_2021);
        output.add(total_Uhccp_SNP_2022);
        return output;
    }

    public static ArrayList<Integer> PDPresolver(ArrayList<HashMap<String, Object>> list){
        int total_PDP = 0, total_PDP_2021 = 0, total_PDP_2022 = 0;
        int total_Aarp_PDP = 0, total_Aarp_PDP_2021 = 0, total_Aarp_PDP_2022 = 0;
        int total_Uhc_PDP = 0, total_Uhc_PDP_2021 = 0, total_Uhc_PDP_2022 = 0;
        int total_Uhccp_PDP = 0, total_Uhccp_PDP_2021 = 0, total_Uhccp_PDP_2022 = 0;
        String[] PDPplans = {"PDP"};
        ArrayList<Integer> output = new ArrayList<>();
        for(HashMap<String, Object> map : list){
            String plan = (String) map.get("PLAN_TYPE");
            String year = (String) map.get("PLAN_YEAR");
            String site = (String) map.get("SITE_ID");
            if (Arrays.asList(PDPplans).contains(plan)){
                total_PDP ++ ;
                if(Objects.equals(year, "2021")){
                    total_PDP_2021 ++;
                    if(Objects.equals(site, "aarp")){
                        total_Aarp_PDP ++;
                        total_Aarp_PDP_2021 ++;
                    }
                    if(Objects.equals(site, "uhc")){
                        total_Uhc_PDP ++;
                        total_Uhc_PDP_2021 ++;
                    }
                    if(Objects.equals(site, "uhccp")){
                        total_Uhccp_PDP ++;
                        total_Uhccp_PDP_2021 ++;
                    }
                }
                if(Objects.equals(year, "2022")){
                    total_PDP_2022 ++;
                    if(Objects.equals(site, "aarp")){
                        total_Aarp_PDP ++;
                        total_Aarp_PDP_2022 ++;
                    }
                    if(Objects.equals(site, "uhc")){
                        total_Uhc_PDP ++;
                        total_Uhc_PDP_2022 ++;
                    }
                    if(Objects.equals(site, "uhccp")){
                        total_Uhccp_PDP ++;
                        total_Uhccp_PDP_2022 ++;
                    }
                }
            }
        } // for loop ends
        output.add(total_PDP);
        output.add(total_PDP_2021);
        output.add(total_PDP_2022);
        output.add(total_Aarp_PDP);
        output.add(total_Aarp_PDP_2021);
        output.add(total_Aarp_PDP_2022);
        output.add(total_Uhc_PDP);
        output.add(total_Uhc_PDP_2021);
        output.add(total_Uhc_PDP_2022);
        output.add(total_Uhccp_PDP);
        output.add(total_Uhccp_PDP_2021);
        output.add(total_Uhccp_PDP_2022);
        return output;
    }

    public static ArrayList<Integer> MAresolver(ArrayList<HashMap<String, Object>> list){
        int total_MA = 0, total_MA_2021 = 0, total_MA_2022 = 0;
        int total_Aarp_MA = 0, total_Aarp_MA_2021 = 0, total_Aarp_MA_2022 = 0;
        int total_Uhc_MA = 0, total_Uhc_MA_2021 = 0, total_Uhc_MA_2022 = 0;
        int total_Uhccp_MA = 0, total_Uhccp_MA_2021 = 0, total_Uhccp_MA_2022 = 0;
        String[] MAplans = {"MA", "MAPD"};
        ArrayList<Integer> output = new ArrayList<>();
        for (HashMap<String, Object> map : list){
            String plan = (String) map.get("PLAN_TYPE");
            String year = (String) map.get("PLAN_YEAR");
            String site = (String) map.get("SITE_ID");
            if(Arrays.asList(MAplans).contains(plan)){
                total_MA ++;
                if(Objects.equals(year, "2021")){
                    total_MA_2021 ++;
                    if(Objects.equals(site, "aarp")){
                        total_Aarp_MA ++;
                        total_Aarp_MA_2021 ++;
                    }
                    if(Objects.equals(site, "uhc")){
                        total_Uhc_MA ++;
                        total_Uhc_MA_2021 ++;
                    }
                    if(Objects.equals(site, "uhccp")){
                        total_Uhccp_MA ++;
                        total_Uhccp_MA_2021 ++;
                    }
                }

                if(Objects.equals(year, "2022")){
                    total_MA_2022 ++;
                    if(Objects.equals(site, "aarp")){
                        total_Aarp_MA ++;
                        total_Aarp_MA_2022 ++;
                    }
                    if(Objects.equals(site, "uhc")){
                        total_Uhc_MA ++;
                        total_Uhc_MA_2022 ++;
                    }
                    if(Objects.equals(site, "uhccp")){
                        total_Uhccp_MA ++;
                        total_Uhccp_MA_2022 ++;
                    }
                }
            }
        } // For loop ends
        output.add(total_MA);
        output.add(total_MA_2021);
        output.add(total_MA_2022);
        output.add(total_Aarp_MA);
        output.add(total_Aarp_MA_2021);
        output.add(total_Aarp_MA_2022);
        output.add(total_Uhc_MA);
        output.add(total_Uhc_MA_2021);
        output.add(total_Uhc_MA_2022);
        output.add(total_Uhccp_MA);
        output.add(total_Uhccp_MA_2021);
        output.add(total_Uhccp_MA_2022);
        return output;
    }
}
