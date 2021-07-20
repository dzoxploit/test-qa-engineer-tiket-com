import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.tiket.com/')

WebUI.click(findTestObject('Object Repository/Page_tiket.com - Satu Aplikasi untuk Kebutu_9595f9/div_DariPilih kota atau bandaraPopulerJakar_e1365f'))

WebUI.click(findTestObject('Object Repository/Page_tiket.com - Satu Aplikasi untuk Kebutu_9595f9/div_Jakarta, Indonesia'))

WebUI.click(findTestObject('Object Repository/Page_tiket.com - Satu Aplikasi untuk Kebutu_9595f9/div_Surabaya, Indonesia'))

WebUI.click(findTestObject('Object Repository/Page_tiket.com - Satu Aplikasi untuk Kebutu_9595f9/div_PulangPilih tanggal pulang'))

WebUI.click(findTestObject('Object Repository/Page_tiket.com - Satu Aplikasi untuk Kebutu_9595f9/label_Pulang'))

WebUI.click(findTestObject('Object Repository/Page_tiket.com - Satu Aplikasi untuk Kebutu_9595f9/div_BerangkatPilih tanggal pergiMinSenSelRa_bab979'))

WebUI.click(findTestObject('Object Repository/Page_tiket.com - Satu Aplikasi untuk Kebutu_9595f9/div_CARI PENERBANGAN'))

WebUI.click(findTestObject('Object Repository/Page_tiket.com - Satu Aplikasi untuk Kebutu_9595f9/button_CARI PENERBANGAN'))

WebUI.click(findTestObject('Object Repository/Page_Harga Tiket Pesawat Murah - Cari  Pesa_27bd2c/div_InformasiTekan di sini untuk lihat kete_1a5415'))

WebUI.click(findTestObject('Object Repository/Page_Harga Tiket Pesawat Murah - Cari  Pesa_27bd2c/div_Mengerti'))

WebUI.click(findTestObject('Object Repository/Page_Harga Tiket Pesawat Murah - Cari  Pesa_27bd2c/div_PILIH'))

WebUI.click(findTestObject('Object Repository/Page_Harga Tiket Pesawat Murah - Cari  Pesa_27bd2c/input_Titel_input-list-autocomplete'))

WebUI.click(findTestObject('Object Repository/Page_Harga Tiket Pesawat Murah - Cari  Pesa_27bd2c/input_Titel_input-list-autocomplete'))

WebUI.click(findTestObject('Object Repository/Page_Harga Tiket Pesawat Murah - Cari  Pesa_27bd2c/li_Tuan'))

WebUI.setText(findTestObject('Object Repository/Page_Harga Tiket Pesawat Murah - Cari  Pesa_27bd2c/input_Titel_input-list-autocomplete'), 
    'Jquera Santos')

WebUI.setText(findTestObject('Object Repository/Page_Harga Tiket Pesawat Murah - Cari  Pesa_27bd2c/input_Nama Lengkap harus diisi_cp-email'), 
    'jquerasantos@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Harga Tiket Pesawat Murah - Cari  Pesa_27bd2c/div_Nomor Telepon'))

WebUI.setText(findTestObject('Object Repository/Page_Harga Tiket Pesawat Murah - Cari  Pesa_27bd2c/input_Kode Negara_cp-phone'), 
    '81413309326')

WebUI.click(findTestObject('Object Repository/Page_Harga Tiket Pesawat Murah - Cari  Pesa_27bd2c/input_Titel_input-list-autocomplete'))

WebUI.click(findTestObject('Object Repository/Page_Harga Tiket Pesawat Murah - Cari  Pesa_27bd2c/li_Tuan'))

WebUI.setText(findTestObject('Object Repository/Page_Harga Tiket Pesawat Murah - Cari  Pesa_27bd2c/input_Titel_input-list-autocomplete'), 
    'Jquera Santos')

WebUI.click(findTestObject('Object Repository/Page_Harga Tiket Pesawat Murah - Cari  Pesa_27bd2c/button_LANJUTKAN KE PEMBAYARAN'))

WebUI.click(findTestObject('Object Repository/Page_Harga Tiket Pesawat Murah - Cari  Pesa_27bd2c/button_YA, LANJUTKAN'))

WebUI.click(findTestObject('Object Repository/Page_Metode Pembayaran/span_BCA Virtual Account'))

WebUI.click(findTestObject('Object Repository/Page_BCA Virtual Account/button_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/Page_BCA Virtual Account/button_Lihat Daftar Pesanan'))

WebUI.click(findTestObject('Object Repository/Page_BCA Virtual Account/button_Ke My Order'))

WebUI.closeBrowser()

