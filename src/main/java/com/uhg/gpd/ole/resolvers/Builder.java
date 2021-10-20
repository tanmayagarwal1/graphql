package com.uhg.gpd.ole.resolvers;

import com.uhg.gpd.ole.graphQlObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Builder {
    graphQlObject obj;
    public void build(ArrayList<Integer> total_list, ArrayList<Integer> MA_list, ArrayList<Integer> PDP_list, ArrayList<Integer> SNP_list){
        obj = new graphQlObject(total_list.get(0), total_list.get(1), total_list.get(2), total_list.get(3),
                total_list.get(4), total_list.get(5), total_list.get(6), total_list.get(7), total_list.get(8),
                total_list.get(9), total_list.get(10), total_list.get(11), MA_list.get(0), MA_list.get(1), MA_list.get(2), MA_list.get(3),
                MA_list.get(4), MA_list.get(5), MA_list.get(6), MA_list.get(7), MA_list.get(8),
                MA_list.get(9), MA_list.get(10), MA_list.get(11), PDP_list.get(0), PDP_list.get(1), PDP_list.get(2), PDP_list.get(3),
                PDP_list.get(4), PDP_list.get(5), PDP_list.get(6), PDP_list.get(7), PDP_list.get(8),
                PDP_list.get(9), PDP_list.get(10), PDP_list.get(11), SNP_list.get(0), SNP_list.get(1), SNP_list.get(2), SNP_list.get(3),
                SNP_list.get(4), SNP_list.get(5), SNP_list.get(6), SNP_list.get(7), SNP_list.get(8),
                SNP_list.get(9), SNP_list.get(10), SNP_list.get(11));
    }

    public graphQlObject getObj(){
        return obj;
    }
}
