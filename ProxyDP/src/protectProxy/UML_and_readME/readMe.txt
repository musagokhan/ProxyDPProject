Koruyucu Proxy Tasarım Deseni

Bu proje, Koruyucu Proxy Tasarım Deseni (Protective Proxy Design Pattern) kullanılarak geliştirilmiştir. Proxy tasarım deseni, bir nesneye erişimi kontrol etmek, doğrulama yapmak veya belirli durumlarda erişimi kısıtlamak için kullanılan bir tasarım desenidir.

Proje Yapısı
1. Sınıflar

    MainWork:
        Programın giriş noktasıdır.
        ManagerProtectProxy sınıfını çağırarak test işlemlerini başlatır.

    IBoss (Arayüz):
        Tüm RealBoss ve ProxyBoss sınıflarının uyguladığı ortak bir arayüz sağlar.
        listen() metodunu içerir.

    RealBoss:
        Gerçek patronu temsil eder.
        Patronun karar alma mekanizmasını (listen()) ve vizyon geliştirme yeteneğini (developVision()) içerir.

    ProxyBoss:
        Gerçek patrona erişimi kontrol eder.
        isAuthorized parametresine bağlı olarak, erişim izni olup olmadığını kontrol eder. (Burasi onemli)
        Eğer erişim izni varsa, RealBoss'un listen() metodunu çağırır. Aksi halde, "Yetki yok" mesajı döner.

    ManagerProtectProxy:
        Proxy ve gerçek nesnelerin kullanımını organize eden yönetici sınıfıdır.
        standartWork() metodu, proxy ve gerçek nesneleri test etmek için kullanılır.
