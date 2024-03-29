package com.example.prm392_finalproject.API;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.prm392_finalproject.DTOModels.Cart_DTO_Add_Request;
import com.example.prm392_finalproject.DTOModels.Cart_DTO_Add_Response;
import com.example.prm392_finalproject.DTOModels.Cart_Product_DTO;
import com.example.prm392_finalproject.DTOModels.Home_Product_DTO;
import com.example.prm392_finalproject.DTOModels.Order_DTO;
import com.example.prm392_finalproject.DTOModels.POST_Cart_DTO;
import com.example.prm392_finalproject.DTOModels.POST_Order_DTO;
import com.example.prm392_finalproject.DTOModels.Product_Detail_DTO;
import com.example.prm392_finalproject.DTOModels.User_ChangePassword_DTO;
import com.example.prm392_finalproject.DTOModels.User_UpdateInformation_DTO;
import com.example.prm392_finalproject.GsonAdapter.LocalDateAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.LocalDate;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

@RequiresApi(api = Build.VERSION_CODES.O)
public interface APIService {
    Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter()).create();
    APIService apiService = new Retrofit.Builder()
            .baseUrl("http://192.168.0.102:8888/api/v1/") //nao chay thi cmt thang duoi mo thang nay ra
//            .baseUrl("https://653b8a902e42fd0d54d54bb7.mockapi.io")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(APIService.class);

//    @GET("api/v1/products")
////////////////////////////////////////////        Gia lap         ///////////////////////////////////////////////////
    /*
    @GET("productDTO")
    Call<ArrayList<Home_Product_DTO>> listProductHomePage();

    @GET("productDetail/{id}")
    Call<Product_Detail_DTO> getProductDetail(@Path("id") int id);
    @GET("/cart")
    Call<ArrayList<Cart_Product_DTO>> listCart();//cai nay de call gia lap
    @GET("/order")
    Call<ArrayList<Order_DTO>> listOrder();
    @GET("/orderDeatail")
    Call<ArrayList<Cart_Product_DTO>> listOrderDetail();

    */
//////////////////////////////////////           Call that             /////////////////////////////////////////////////////////

    //tat ca id deu dang de mac dinh la 1 nhe

    @GET("products") //Viet Anh doi duong dan o day
    Call<ArrayList<Home_Product_DTO>> listProductHomePage();

    @GET("products/{id}")//Viet Anh doi duong dan o day
    Call<Product_Detail_DTO> getProductDetail(@Path("id") int id);
    @GET("cart/{id}")//truyen vao id nguoi dung ***OK
    Call<ArrayList<Cart_Product_DTO>> listCart(@Path("id") int id);
    @GET("order/{id}")//***OK truyen vao id nguoi dung, dung thang nay thi vao OrderActivity xoa cmt thang cu lai uncmt thang moi o duoi ra, nho sua lai id nguoi dung ca thang detail cung the
    Call<ArrayList<Order_DTO>> listOrder(@Path("id") int id);
    @GET("order/detail/{id}")// ***OK truyen vao id cua order, dung thang nay thi vao OrderActivity xoa cmt thang cu lai uncmt thang moi o duoi ra
    Call<ArrayList<Cart_Product_DTO>> listOrderDetail(@Path("id") int id);
    @POST("cart") //***OK
    Call<Void> updateCart(@Body POST_Cart_DTO cart);

    @PUT("order/{id}")//***OK truyen vào orderID thay doi trang thai ve huy don
    Call<Order_DTO> cancelOrder(@Path("id") int id);

    @GET("quantity/{id}")// ***OK tra ve so luong product trong cart(chi dem product khong can tong quantity)
    Call<Integer> productInCart(@Path("id") int id);

    @POST("order")// ***OK update len mot order chua thong tin don hang va list product(order detail), tam thoi de uID la 1
    Call<POST_Order_DTO>  addOrder(@Body POST_Order_DTO post_order_dto);

    @GET("confirmPassword") //xac nhan ton tai user co id la userID va mk la password
    Call<Boolean> confirmPassword(@Body User_ChangePassword_DTO user_changePassword_dto);

    @PUT("changePassword")
    Call<Void> changePassword(@Body User_ChangePassword_DTO user_changePassword_dto);

    @PUT("updateAccountInformation")
    Call<Void> updateAccountInformation(@Body User_UpdateInformation_DTO user_updateInformation_dto);

    @POST("cart/add")
    Call<Cart_DTO_Add_Response> addToCart(@Body Cart_DTO_Add_Request cartDtoAddRequest);

//    @GET("api/v1/products")
//    Call<List<Home_Product_DTO>> getListProduct();

}
