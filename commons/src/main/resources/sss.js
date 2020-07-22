var Home = {
    baseUrl: "https://api-wt.nesh.netease.com", init: function () {
        this.getHeroes(), this.setVideoPop(), this.setBtnTrack()
    }, initClick: function () {
    }, setBtnTrack: function () {
        Common.setTrackerCode(".download_ios", "http://vg.163.com/home/ios", "App store下载"), Common.setTrackerCode(".android_btn", "http://vg.163.com/home/android", "Android下载")
    }, newsSlider: function () {
        $(".flex_news_item_mobile").flickity({prevNextButtons: !1, pageDots: !0, autoPlay: !0})
    }, setVideoPop: function () {
        new JV.popSlider(".video_play_btn", {
            isShowNum: !1,
            data: [{
                video: "//web-static.bcgames.163.com/vg/video/map.mp4",
                width: "100%",
                height: "100%",
                title: "　　　　　"
            }]
        })
    }, switchHero: function () {
        $(".heroes_slider").flickity({
            prevNextButtons: !1,
            initialIndex: 0,
            pageDots: !1
        }), $(".heroes_control").flickity({asNavFor: ".heroes_slider", contain: !1, prevNextButtons: !1, pageDots: !1})
    }, getHeroes: function () {
        $.ajax({
            type: "GET",
            async: !1,
            url: "/data/heroes.json",
            jsonp: "callback",
            jsonpCallback: "heroesJson",
            dataType: "jsonp",
            success: function (a) {
                var b = juicer(Home.setHeroesHtml(), a);
                $(".heroes_control").html(b);
                var c = juicer(Home.setHeroDetailHtml(), a);
                $(".heroes_slider").html(c), Home.switchHero()
            }
        })
    }, setHeroesHtml: function () {
        return ["{@each heroes as item,index}", "{@if item.weeklyFlag === true}", '<li><img src="//web-static.bcgames.163.com/vg/image/heroimages/list-image-small/${item.avatar}.png"></li>', "{@/if}", "{@/each}"].join("")
    }, setHeroDetailHtml: function () {
        return ["{@each heroes as item,index}", "{@if item.weeklyFlag === true}", "<li>", '<img class="heroes_full_size" src="//web-static.bcgames.163.com/vg/image/heropictures/${item.e_name}/${item.l_detail_image}" />', '<div class="hero_info_text">', "<h3>${item.name}<span>${item.role}，${item.type}</span></h3>", "<p>${item.detail}</p>", '<a href="/heroes/${item.id}" class="detail_btn">查看更多</a>', "</div>", "</li>", "{@/if}", "{@/each}"].join("")
    }
};