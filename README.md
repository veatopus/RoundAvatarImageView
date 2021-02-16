# Round Avatar ImageView Mask

**Version 1.0.0**

---

## Download

**Or use Gradle:**
```gradle
allprojects {
        repositories {
		...
		maven { url 'https://www.jitpack.io' }
	}
}
```

- Step 2. Add the dependency

```gradle
dependencies {
	 implementation 'com.github.veatopus:RoundAvatarImageView:1.0'
}
```

**Or Maven:**
```xml
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://www.jitpack.io</url>
	</repository>
</repositories>
```

- Step 2. Add the dependency

```xml
<dependency>
    <groupId>com.github.veatopus</groupId>
    <artifactId>RoundAvatarImageView</artifactId>
    <version>1.0</version>
</dependency>
```

---

## How do i use RoundAvatarImageView
```xml
<kg.geektech.ruslan.createviewwithcastomtheme.ui.AvatarImageViewMask
    android:layout_width="120dp"
    android:layout_height="120dp"
    android:src="@mipmap/ic_launcher"
    app:aiv_borderColor="@android:color/black"
    app:aiv_borderWidth="8dp"/>
```

- aiv_borderWidth - parameter or border size
- aiv_borderColor - parameter pr border color
