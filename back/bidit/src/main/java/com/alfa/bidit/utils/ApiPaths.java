package com.alfa.bidit.utils;

public class ApiPaths {

    //TODO I think all variable names better be "path".

    private static final String BASE_PATH = "/api";

    private static final String V1_PATH="/v1";

    public static  final  class UserControllerPath{
        public static  final String control = BASE_PATH + V1_PATH + "/users";
    }

    public static final class AuctionControllerPath{
        public static final String auction = BASE_PATH + V1_PATH + "/auctions";
    }

    public static final class FavoriteControllerPath{
        public static final String favorite = BASE_PATH + V1_PATH + "/favorites";
    }

    public static final class BidControllerPath{
        public static final String bid = AuctionControllerPath.auction + "/{auction_id}";
    }
}
