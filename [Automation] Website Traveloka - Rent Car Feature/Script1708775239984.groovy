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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Open Browser
WebUI.openBrowser('https://www.traveloka.com/en-id')

WebUI.maximizeWindow()

//Entered Menu Car Rental
WebUI.click(findTestObject('SearchRent/div_Car Rental'))

//Search based on Location
WebUI.sendKeys(findTestObject('SearchRent/input_Your Rental Location_css-11aywtz r-cwxd7f r-13awgt0 r-t1w4ow r-ubezar r-majxgm r-135wba7 r-bcqeeo r-1ny4l3l r-10paoce r-13n6l4s'), 
    'jakarta')
//Pick Location
WebUI.findWebElement(findTestObject('SearchRent/div_JakartaJakarta Special Capital Region, IndonesiaRegion'), 0)
WebUI.click(findTestObject('SearchRent/div_JakartaJakarta Special Capital Region, IndonesiaRegion'))

//Pick Rental Start Date
WebUI.clickOffset(findTestObject('SearchRent/div_Rental Start Date_css-1dbjc4n r-14lw9ot r-d045u9 r-1p0dtai r-1d2f490 r-u8s1d r-zchlnj r-ipm5af r-14qw7yl r-z2knda r-1wyyakw'), 
    0, 0)
WebUI.click(findTestObject('SearchRent/div_27'))

//Pick Rentan Start Time
WebUI.clickOffset(findTestObject('SearchRent/div_Start Time_css-1dbjc4n r-14lw9ot r-d045u9 r-1p0dtai r-1d2f490 r-u8s1d r-zchlnj r-ipm5af r-14qw7yl r-z2knda r-1wyyakw'), 
    0, 0)
WebUI.click(findTestObject('SearchRent/div_3 (1)'))
WebUI.click(findTestObject('SearchRent/div_30'))
WebUI.click(findTestObject('SearchRent/div_Done'))

//Pick Rental End Date
WebUI.clickOffset(findTestObject('SearchRent/div_Rental End Date_css-1dbjc4n r-14lw9ot r-d045u9 r-1p0dtai r-1d2f490 r-u8s1d r-zchlnj r-ipm5af r-14qw7yl r-z2knda r-1wyyakw'), 
    0, 0)
WebUI.click(findTestObject('SearchRent/div_29'))

//Pick Rental End Time
WebUI.clickOffset(findTestObject('SearchRent/div_End Time_css-1dbjc4n r-14lw9ot r-d045u9 r-1p0dtai r-1d2f490 r-u8s1d r-zchlnj r-ipm5af r-14qw7yl r-z2knda r-1wyyakw'), 
    0, 0)
WebUI.click(findTestObject('SearchRent/div_1 (1)'))
WebUI.click(findTestObject('SearchRent/div_030'))
WebUI.click(findTestObject('SearchRent/div_done (1)'))

//Click button Search Car Rental
WebUI.clickOffset(findTestObject('SearchRent/div_search'), 0, 0)

//Pick Car & Click Continue
WebUI.scrollToElement(findTestObject('Select Car_until DropOff/div_Continue'), 0)
WebUI.clickOffset(findTestObject('Select Car_until DropOff/div_Continue'), 0, 0)

//Pick Car Provider & Click Continue
WebUI.scrollToElement(findTestObject('Select Car_until DropOff/div_Continue_provide'), 0)
WebUI.clickOffset(findTestObject('Select Car_until DropOff/div_Continue_provide'), 0, 0)

//Pick The Pick-Up Location 'Rental Office'
WebUI.scrollToElement(findTestObject('Select Car_until DropOff/div_radio_Rental Office'), 0)
WebUI.clickOffset(findTestObject('Select Car_until DropOff/div_radio_Rental Office'), 0, 0)
WebUI.clickOffset(findTestObject('Select Car_until DropOff/div_dropdown_Pool TRAC Jakarta_css-1dbjc4n r-mgfd1o r-1ljd8xs r-edyy15'), 
    0, 0)
WebUI.clickOffset(findTestObject('Select Car_until DropOff/div_value_Pool TRAC Jakarta'), 0, 0)

//Pick The Drop-Off Location 'Other Locations'
WebUI.scrollToElement(findTestObject('Select Car_until DropOff/div_dropoff_Other Locations'), 0)
WebUI.waitForPageLoad(4)
WebUI.clickOffset(findTestObject('Select Car_until DropOff/div_dropoff_Other Locations'), 0, 0)
//Search location on search box Other Locations
WebUI.clickOffset(findTestObject('Select Car_until DropOff/div_searchbox_other'), 0, 0)
WebUI.sendKeys(findTestObject('Page_Cheapest Car Rental from Rp200kday Without or With Driver  Search for Cars on Traveloka/input_Search location or address_css'), 
    'Soekarno')
WebUI.clickOffset(findTestObject('Select Car_until DropOff/div_Soekarno Hatta International Airport (CGK)Benda, Cengkareng, Jakarta Barat, Jakarta, Indonesia, Asia Tenggara, AsiaAirport'), 
    0, 0)

//Input Note
WebUI.sendKeys(findTestObject('Select Car_until DropOff/textarea_catatan_css-11aywtz r-13awgt0 r-t1w4ow r-ubezar r-majxgm r-135wba7 r-bcqeeo r-1ny4l3l r-10paoce r-13n6l4s'), 
    'jangan lupa datang tepat waktu pak')

//Click Continue
WebUI.scrollToElement(findTestObject('Select Car_until DropOff/div_next_ondetail'), 0)
WebUI.clickOffset(findTestObject('Select Car_until DropOff/div_next_ondetail'), 0, 0)

//Input Data of Contact Details
WebUI.sendKeys(findTestObject('contact details/input__fullname cust-css-11aywtz r-13awgt0 r-t1w4ow r-ubezar r-majxgm r-135wba7 r-bcqeeo r-1ny4l3l r-10paoce r-13n6l4s'), 
    'Salsabila')
WebUI.sendKeys(findTestObject('contact details/input__email-cust'), 'lalafieldoff1@gmail.com')
WebUI.sendKeys(findTestObject('contact details/input__hp-cust'), '85156622850')

//Input Data of Driver Details
WebUI.scrollToElement(findTestObject('contact details/dropdown Mr'), 0)
WebUI.selectOptionByValue(findTestObject('contact details/dropdown Mr'), 'MR', false)
WebUI.sendKeys(findTestObject('contact details/input_fullnamedriver'), 'Suratno')
WebUI.sendKeys(findTestObject('contact details/input__hp-driver'), '85156622850')

//Click Continue
WebUI.click(findTestObject('contact details/div_Continue'))

//Input Special Request
WebUI.scrollToElement(findTestObject('rental requirements/input__textarea sepcial req'), 0)
WebUI.sendKeys(findTestObject('rental requirements/input__textarea sepcial req'), 'Saya mau yang mobilnya bersih dan siap pakai langsung ya')

//Click Component to Check Rental Requirements
WebUI.clickOffset(findTestObject('rental requirements/component__req'), 0, 0)
//Select checkbox 'All'
WebUI.click(findTestObject('Page_Traveloka - Southeast Asias Leading Travel Platform/div_Check All'))
//Click Save
WebUI.scrollToElement(findTestObject('rental requirements/btn_save'), 0)
WebUI.click(findTestObject('rental requirements/btn_save'))

//Click Continue To Payment
WebUI.scrollToElement(findTestObject('rental requirements/btn_next payment'), 0)
WebUI.clickOffset(findTestObject('rental requirements/btn_next payment'), 0, 0)

//Click Continue on Pop Up Confirmation
WebUI.clickOffset(findTestObject('rental requirements/btn_continue'), 0, 0)

//Select Payment Method using Alfamart
WebUI.click(findTestObject('payment/sub_alfa'))
//Click Pay with Alfamart
WebUI.scrollToElement(findTestObject('payment/btn_pay'), 0)
WebUI.clickOffset(findTestObject('payment/btn_pay'), 0, 0)

//Close Browser
WebUI.closeBrowser()

