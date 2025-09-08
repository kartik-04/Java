package design_pattern.factory;

public class Flutter {
    void refreshUI(){
        System.out.println("Refreshing UI");
    }

    void settingTheme(){
        System.out.println("Setting theme");
    }

    UIFactory getUIFactory(SupportedPlatform platform){
//        if(platform.equals(SupportedPlatform.ANDROID)){
//            return new AndroidUIFactory();
//        }else if(platform.equals(SupportedPlatform.IOS)){
//            return new IOSUIFactory();
//        }else if(platform.equals(SupportedPlatform.WINDOWS)){
//            return new WindowsFactory();
//        }
//        return null;
        return UiFactoryFactory.getUIFactoryForPlatform(platform);
    }
}
