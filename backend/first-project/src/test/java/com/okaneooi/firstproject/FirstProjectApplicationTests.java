package com.okaneooi.firstproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstProjectApplicationTests {


    @Test
    void contextLoads() {
        /*
         * 這個預設產生的測試檔案的用處：
         * 確保 Spring 應用程式上下文可以正確載入：
         * //@SpringBootTest 註解會啟動一個最小化的 Spring 應用程式上下文用於測試。contextLoads() 方法在沒有邏輯的情況下，如果能正常執行並不拋出例外，表示應用程式的基本設定（元件掃描、組態檔、依賴注入）均能正常載入。
         * 基本健康檢查：
         * 雖然這個測試並不驗證具體功能，但它能在程式碼變更後，做為最基本的「健康檢查」，以確保主體結構沒有重大問題導致應用無法啟動。
         * */

    }

}
