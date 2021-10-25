package com.nickrocky;

/**
 * @Author nickrocky213
 * @Date: 10/25/2021
 * Genesis block is initialized with the burn wallet sending a master wallet the total supply of coins.
 * Max supply of cuil coin is 200 million.
 * */
public class GenesisBlock extends Block{
    public GenesisBlock() {
        super("0",
                "https://www.youtube.com/watch?v=nfdEdE96En0",
                new Transaction("MIIBuDCCASwGByqGSM44BAEwggEfAoGBAP1/U4EddRIpUt9KnC7s5Of2EbdSPO9EAMMeP4C2USZpRV1AIlH7WT2NWPq/xfW6MPbLm1Vs14E7gB00b/JmYLdrmVClpJ+f6AR7ECLCT7up1/63xhv4O1fnxqimFQ8E+4P208UewwI1VBNaFpEy9nXzrith1yrv8iIDGZ3RSAHHAhUAl2BQjxUjC8yykrmCouuEC/BYHPUCgYEA9+GghdabPd7LvKtcNrhXuXmUr7v6OuqC+VdMCz0HgmdRWVeOutRZT+ZxBxCBgLRJFnEj6EwoFhO3zwkyjMim4TwWeotUfI0o4KOuHiuzpnWRbqN/C/ohNWLx+2J6ASQ7zKTxvqhRkImog9/hWuWfBpKLZl6Ae1UlZAFMO/7PSSoDgYUAAoGBAIg84M2Utm8CDYvq92XGpF3tlpws5EfYI5Y9HlFycIWEjESgAbERNOIm2IO2m2Cj0/Wv7nlppLevG4iZgSUoHndriVFkJs7RJkTGG1dgFVTnT3eINPI176BXfkQO5+Oy7MgZH4uZNAo0tdvQRzhEHdA9FsCzimBH7RyabbMe5XcU",
                        "MIIBtzCCASwGByqGSM44BAEwggEfAoGBAP1/U4EddRIpUt9KnC7s5Of2EbdSPO9EAMMeP4C2USZpRV1AIlH7WT2NWPq/xfW6MPbLm1Vs14E7gB00b/JmYLdrmVClpJ+f6AR7ECLCT7up1/63xhv4O1fnxqimFQ8E+4P208UewwI1VBNaFpEy9nXzrith1yrv8iIDGZ3RSAHHAhUAl2BQjxUjC8yykrmCouuEC/BYHPUCgYEA9+GghdabPd7LvKtcNrhXuXmUr7v6OuqC+VdMCz0HgmdRWVeOutRZT+ZxBxCBgLRJFnEj6EwoFhO3zwkyjMim4TwWeotUfI0o4KOuHiuzpnWRbqN/C/ohNWLx+2J6ASQ7zKTxvqhRkImog9/hWuWfBpKLZl6Ae1UlZAFMO/7PSSoDgYQAAoGATUn0IGBQP0lZf6nN4C5C2VFRdBeu1yM0OKy0g5a6lz4b3C6F6RiXkK7VMtj20tm8SVk7lpeKylKEXc4YyGXcpxbQNpZCLTNu1KdNKOssbZvLLFr43pgvUnUvr9uz/s9jmF87UiQHSvkbCwePtmCxYF2P6ltzfArOmTorMkl84e8=",
                        200000000));
    }
}
