package Data;

import org.testng.annotations.DataProvider;

public class Data {


    @DataProvider(name = "listingData")
    public static Object[][] listingData() {
        return new Object[][]{
                {"D12", "S,M,L,XL", "Blue,Pink,Yellow,White"},
                {"D12", "S,M,L,XL", "Blue,Pink,Yellow,White"},
                {"D12", "S,M,L,XL", "Blue,Pink,Yellow,White"},
                {"D12", "S,M,L,XL", "Blue,Pink,Yellow,White"},
                {"D12", "S,M,L,XL", "Blue,Pink,Yellow,White"}
        };

    }
}
