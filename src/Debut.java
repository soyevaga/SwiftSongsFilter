public class Debut {
    //only one that begins in 0
    String[] lyrics;
    String[] titles;
    String album;
    int tracksNumber;

    public Debut() {
        tracksNumber= 14;
        lyrics = new String[tracksNumber];
        album = "Debut";
        titles = new String[]{"Tim McGraw", "Picture to Burn", "Teardrops on My Guitar", "A Place in This World",
                "Cold as You", "The Outside", "Tied Together with a Smile",
                "Stay Beautiful", "Should've Said No", "Mary's Song (Oh My My My)",
                "Our Song", "I'm Only Me When I'm with You", "Invisible", "A Perfectly Good Heart"
        };
        lyrics[0]= "He said the way my blue eyes shined Put those Georgia stars to shame that night I said, \"That's a lie\"" +
            "Just a boy in a Chevy truck That had a tendency of gettin' stuck On backroads at night And I was right there beside him all summer long" +
            "And then the time we woke up to find that summer gone But when you think Tim McGraw I hope you think my favorite song" +
            "The one we danced to all night long The moon like a spotlight on the lake When you think happiness I hope you think that little black dress" +
            "Think of my head on your chest And my old faded blue jeans When you think Tim McGraw I hope you think of me" +
            "September saw a month of tears And thankin' God that you weren't here To see me like that But in a box beneath my bed" +
            "Is a letter that you never read From three summers back It's hard not to find it all a little bittersweet" +
            "And lookin' back on all of that, it's nice to believe When you think Tim McGraw I hope you think my favorite song" +
            "The one we danced to all night long The moon like a spotlight on the lake When you think happiness I hope you think that little black dress" +
            "Think of my head on your chest And my old faded blue jeans When you think Tim McGraw I hope you think of me" +
            "And I'm back for the first time since then I'm standin' on your street And there's a letter left on your doorstep" +
            "And the first thing that you'll read Is, \"When you think Tim McGraw I hope you think my favorite song Someday you'll turn your radio on" +
            "I hope it takes you back to that place\" When you think happiness I hope you think that little black dress" +
            "Think of my head on your chest And my old faded blue jeans When you think Tim McGraw I hope you think of me" +
            "Oh, think of me, mmm He said the way my blue eyes shined Put those Georgia stars to shame that night I said, \"That's a lie\"";
        lyrics[1]= "State the obvious, I didn't get my perfect fantasy I realize you love yourself more than you could ever love me" +
                "So go and tell your friends that I'm obsessive and crazy That's fine, I'll tell mine you're gay, you won't mind if I say" +
                "By the way I hate that stupid old pickup truck you never let me drive You're a redneck heartbreak who's really bad at lyin'" +
                "So watch me strike a match on all my wasted time As far as I'm concerned, you're just another picture to burn" +
                "There's no time for tears, I'm just sittin' here planning my revenge There's nothing stoppin' me from goin' out with all of your best friends" +
                "And if you come around sayin' sorry to me My daddy's gonna show ya how sorry you'll be 'Cause I hate that stupid old pickup truck you never let me drive" +
                "You're a redneck heartbreak who's really bad at lyin' So watch me strike a match on all my wasted time" +
                "As far as I'm concerned, you're just another picture to burn And if you're missing me, you'd better keep it to yourself" +
                "'Cause coming back around here would be bad for your health 'Cause I hate that stupid old pickup truck you never let me drive" +
                "You're a redneck heartbreak who's really bad at lyin' So watch me strike a match on all my wasted time" +
                "In case you haven't heard I really, really hate that stupid old pickup truck you never let me drive" +
                "You're a redneck heartbreak who's really bad at lyin' So watch me strike a match on all my wasted time" +
                "As far as I'm concerned, you're just another picture to burn Burn, burn, burn, baby, burn You're just another picture to burn" +
                "Baby, burn ";
        lyrics[2]= "Drew looks at me I fake a smile so he won't see That I want and I'm needing Everything that we should be" +
                "I'll bet she's beautiful, that girl he talks about And she's got everything that I have to live without" +
                "Drew talks to me I laugh 'cause it's just so funny That I can't even see Anyone when he's with me" +
                "He says he's so in love, he's finally got it right I wonder if he knows he's all I think about at night" +
                "He's the reason for the teardrops on my guitar The only thing that keeps me wishin' on a wishing star" +
                "He's the song in the car I keep singing, don't know why I do Drew walks by me Can he tell that I can't breathe?" +
                "And there he goes, so perfectly The kind of flawless I wish I could be She'd better hold him tight, give him all her love" +
                "Look in those beautiful eyes and know she's lucky 'cause He's the reason for the teardrops on my guitar" +
                "The only thing that keeps me wishin' on a wishing star He's the song in the car I keep singing, don't know why I do" +
                "So I'll drive home alone as I turn off the light I'll put his picture down and maybe get some sleep tonight" +
                "'Cause he's the reason for the teardrops on my guitar The only one who's got enough of me to break my heart" +
                "He's the song in the car I keep singing, don't know why I do He's the time taken up, but there's never enough" +
                "And he's all that I need to fall into Drew looks at me I fake a smile, so he won't see ";
        lyrics[3]="I don't know what I want So don't ask me 'Cause I'm still trying, to figure it out Don't know what's down, this road" +
                "I'm just walking Trying to see through the rain coming down Even though I'm not the only one, who feels the way I do" +
                "I'm alone, on my own And that's all I know I'll be strong, I'll be wrong Oh, but life goes on" +
                "Oh, I'm just a girl Trying to find a place in this world Got the radio on, my old blue jeans" +
                "And I'm wearing my heart on my sleeve Feeling lucky today, got the sunshine Could you tell me what more do I need?" +
                "And tomorrow's just a mystery Oh yeah, but that's okay I'm alone, on my own And that's all I know" +
                "I'll be strong, I'll be wrong Oh, but life goes on Oh, I'm just a girl Trying to find a place, in this world" +
                "Maybe I'm just a girl on a mission But I'm ready to fly I'm alone, on my own And that's all I know" +
                "Oh, I'll be strong, I'll be wrong Oh, but life goes on Oh, I'm alone, on my own And that's all I know" +
                "Oh, I'm just a girl Trying to find a place, in this world Oh, I'm just a girl Oh, I'm just a girl" +
                "Oh, oh Oh, I'm just a girl ";
        lyrics[4]= "You have a way of coming easily to me And when you take, you take the very best of me So I start a fight 'cause I need to feel something" +
                "And you do what you want 'cause I'm not what you wanted Oh, what a shame, what a rainy ending" +
                "Given to a perfect day Just walk away, ain't no use defending Words that you will never say And now that I'm sitting here thinking it through" +
                "I've never been anywhere cold as you You put up walls and paint them all a shade of gray And I stood there loving you and wished them all away" +
                "And you come away with a great little story Of a mess of a dreamer with the nerve to adore you" +
                "Oh, what a shame, what a rainy ending Given to a perfect day So just walk away, ain't no use defending" +
                "Words that you will never say And now that I'm sitting here thinking it through I've never been anywhere cold as you" +
                "You never did give a damn thing, honey" +
                "But I cried, cried for you And I know you wouldn't have told nobody If I died, died for you, died for you" +
                "Oh, what a shame, what a rainy ending Given to a perfect day, oh Every smile you fake is so condescending" +
                "Counting all the scars you made And now that I'm sitting here thinking it through I've never been anywhere cold as you" +
                "Ooh-oh[Verse 1] You have a way of coming easily to me And when you take, you take the very best of me" +
                "So I start a fight 'cause I need to feel something And you do what you want 'cause I'm not what you wanted" +
                "Oh, what a shame, what a rainy ending Given to a perfect day Just walk away, ain't no use defending" +
                "Words that you will never say And now that I'm sitting here thinking it through I've never been anywhere cold as you" +
                "You put up walls and paint them all a shade of gray And I stood there loving you and wished them all away" +
                "And you come away with a great little story Of a mess of a dreamer with the nerve to adore you" +
                "Oh, what a shame, what a rainy ending Given to a perfect day So just walk away, ain't no use defending" +
                "Words that you will never say And now that I'm sitting here thinking it through I've never been anywhere cold as you" +
                "See Taylor Swift Live Get tickets as low as $97 You might also like Begin Again Taylor Swift Wonderland" +
                "Taylor Swift Is It Over Now? (Taylor’s Version) [From The Vault] Taylor Swift You never did give a damn thing, honey" +
                "But I cried, cried for you And I know you wouldn't have told nobody If I died, died for you, died for you" +
                "Oh, what a shame, what a rainy ending Given to a perfect day, oh Every smile you fake is so condescending" +
                "Counting all the scars you made And now that I'm sitting here thinking it through I've never been anywhere cold as you" +
                "Ooh-oh ";
        lyrics[5]= "I didn't know what I would find When I went looking for a reason, I know I didn't read between the lines" +
                "And, baby, I've got nowhere to go I tried to take the road less traveled by But nothing seems to work the first few times" +
                "Am I right? So how can I ever try to be better? Nobody ever lets me in I can still see you, this ain't the best view" +
                "On the outside looking in I've been a lot of lonely places I've never been on the outside You saw me there, but never knew" +
                "That I would give it all up to be A part of this, a part of you And now, it's all too late, so you see" +
                "You could've helped if you had wanted to But no one notices until it's too late to do anything" +
                "How can I ever try to be better? Nobody ever lets me in I can still see you, this ain't the best view" +
                "On the outside looking in I've been a lot of lonely places I've never been on the outside Oh, yeah" +
                "How can I ever try to be better? Nobody ever lets me in And I can still see you, this ain't the best view" +
                "On the outside looking in I've been a lot of lonely places I've never been on the outside Oh-oh" +
                "Oh, oh-oh Oh-oh Oh-oh ";
        lyrics[6]= "Seems the only one who doesn't see your beauty Is the face in the mirror looking back at you" +
                "You walk around here thinking you're not pretty But that's not true 'Cause I know you Hold on, baby, you're losing it" +
                "The water's high, you're jumping into it and letting go And no one knows That you cry, but you don't tell anyone" +
                "That you might not be the golden one And you're tied together with a smile But you're coming undone, oh" +
                "I guess it's true that love was all you wanted 'Cause you're giving it away like it's extra change" +
                "Hoping it will end up in his pocket (Pocket) But he leaves you out like a penny in the rain" +
                "Oh, 'cause it's not his price to pay It's not his price to pay Hold on, baby, you're losing it" +
                "The water's high, you're jumping into it and letting go And no one knows That you cry, but you don't tell anyone" +
                "That you might not be the golden one And you're tied together with a smile But you're coming undone, oh" +
                "Oh, oh Hold on, baby, you're losing it The water's high, you're jumping into it and letting go" +
                "And no one knows That you cry but you don't tell anyone That you might not be the golden one" +
                "And you're tied together with a smile But you're coming undone, oh You're tied together with a smile" +
                "But you're coming undone, oh, oh-oh Goodbye, baby With a smile, baby, baby Oh ";
        lyrics[7] = "Cory's eyes are like a jungle He smiles, it's like the radio He whispers songs into my window" +
                "In words that nobody knows There's pretty girls on every corner They watch him as he's walking home" +
                "Saying, \"Does he know?\" Will you ever know? You're beautiful, every little piece, love Don't you know you're really gonna be someone?" +
                "Ask anyone And when you find everything you looked for I hope your life leads you back to my door" +
                "Oh, but if it don't Stay beautiful Cory finds another way to be The highlight of my day I'm taking pictures in my mind" +
                "So I can save 'em for a rainy day It's hard to make a conversation When he's taking my breath away" +
                "I should say, \"Hey, by the way\" You're beautiful, every little piece, love Don't you know you're really gonna be someone?" +
                "Ask anyone And when you find everything you looked for I hope your life leads you back to my door" +
                "Oh, but if it don't Stay beautiful If you and I are a story That never gets told If what you are is a daydream" +
                "I'll never get to hold, at least you'll know You're beautiful, every little piece, love Don't you know you're really gonna be someone?" +
                "Ask anyone And when you find everything you looked for I hope your life leads you back to my front door" +
                "Oh, but if it don't Will you stay beautiful, beautiful, beautiful? Beautiful, beautiful, beautiful" +
                "La-la-la Oh-oh-oh Oh-oh-oh-oh Oh, but if it don't Stay beautiful, stay beautiful Na-na-na, na-na";
        lyrics[8]="It's strange to think the songs we used to sing The smiles, the flowers, everything is gone" +
                "Yesterday, I found out about you Even now, just lookin' at you feels wrong You say that you'd take it all back" +
                "Given one chance It was a moment of weakness And you said yes You should've said no, you should've gone home" +
                "You should've thought twice 'fore you let it all go You should've known that word 'Bout what you did with her'd get back to me (Get back to me)" +
                "And I should've been there in the back of your mind I shouldn't be asking myself why You shouldn't be begging for forgiveness at my feet" +
                "You should've said no Baby, and you might still have me You can see that I've been cryin' And baby, you know all the right things to say" +
                "But do you honestly expect me to believe We could ever be the same? You say that the past is the past" +
                "You need one chance It was a moment of weakness And you said yes You should've said no, you should've gone home" +
                "You should've thought twice 'fore you let it all go You should've known that word 'Bout what you did with her’d get back to me (Get back to me)" +
                "And I should've been there in the back of your mind I shouldn't be asking myself why You shouldn't be begging for forgiveness at my feet" +
                "You should've said no Baby, and you might still have me Oh, oh I can't resist Before you go, tell me this" +
                "Was it worth it? Was she worth this? No, no No, no, no, no You should've said no, you should've gone home" +
                "You should've thought twice 'fore you let it all go You should've known that word 'Bout what you did with her’d get back to me (Get back to me)" +
                "And I should've been there, in the back of your mind I shouldn't be asking myself why You shouldn't be begging for forgiveness at my feet" +
                "You should've said no Baby, and you might still have me ";
        lyrics[9] = "She said I was seven and you were nine I looked at you like the stars that shined In the sky, the pretty lights" +
                "And our daddies used to joke about the two of us Growing up and falling in love And our mamas smiled and rolled their eyes" +
                "And said, \"Oh, my, my, my\" Take me back to the house in the backyard tree Said you'd beat me up, you were bigger than me" +
                "You never did, you never did Take me back when our world was one block wide I dared you to kiss me and ran when you tried" +
                "Just two kids, you and I Oh, my, my, my, my Well, I was sixteen when suddenly I wasn't that little girl you used to see" +
                "But your eyes still shined like pretty lights And our daddies used to joke about the two of us" +
                "They never believed we'd really fall in love And our mamas smiled and rolled their eyes And said, \"Oh, my, my, my\"" +
                "Take me back to the creek beds we turned up 2 AM riding in your truck And all I need is you next to me" +
                "Take me back to the time we had our very first fight The slamming of doors 'stead of kissing goodnight" +
                "You stayed outside 'til the morning light Oh, my, my, my, my A few years had gone and come around" +
                "We were sitting at our favorite spot in town And you looked at me, got down on one knee Take me back to the time when we walked down the aisle" +
                "Our whole town came and our mamas cried You said, \"I do,\" and I did, too Take me home where we met so many years before" +
                "We'll rock our babies on that very front porch After all this time, you and I And I'll be eighty-seven, you'll be eighty-nine" +
                "I'll still look at you like the stars that shine In the sky, oh, my, my, my ";
        lyrics[10]= "I was ridin' shotgun with my hair undone In the front seat of his car He's got a one-hand feel on the steering wheel" +
                "The other on my heart I look around, turn the radio down He says, \"Baby, is something wrong?\"" +
                "I say, \"Nothin', I was just thinkin' How we don't have a song\" And he says Our song is a slamming screen door" +
                "Sneakin' out late, tapping on your window When we're on the phone and you talk real slow 'Cause it's late and your mama don't know" +
                "Our song is the way you laugh The first date, \"Man, I didn't kiss her and I should have\" And when I got home, 'fore I said, \"Amen\"" +
                "Askin' God if he could play it again I was walking up the front porch steps After everything that day" +
                "Had gone all wrong and been trampled on And lost and thrown away Got to the hallway, well on my way to my lovin' bed" +
                "I almost didn't notice all the roses And the note that said Our song is a slamming screen door" +
                "Sneakin' out late, tapping on your window When we're on the phone and you talk real slow 'Cause it's late and your mama don't know" +
                "Our song is the way you laugh The first date, \"Man, I didn't kiss her and I should have\" And when I got home, 'fore I said, \"Amen\"" +
                "Askin' God if he could play it again Da-da-da-da I've heard every album, listened to the radio" +
                "Waited for somethin' to come along That was as good as our song 'Cause our song is a slamming screen door" +
                "Sneakin' out late, tapping on his window When we're on the phone and he talks real slow 'Cause it's late and his mama don't know" +
                "Our song is the way he laughs The first date, \"Man, I didn't kiss him and I should have\" And when I got home, 'fore I said, \"Amen\"" +
                "Askin' God if he could play it again Play it again, oh yeah Oh-oh, yeah I was ridin' shotgun with my hair undone" +
                "In the front seat of his car I grabbed a pen and an old napkin And I wrote down our song ";
        lyrics[11]= "Friday night beneath the stars In a field behind your yard You and I are painting pictures in the sky" +
                "And sometimes, we don't say a thing Just listen to the crickets sing Everything I need is right here by my side" +
                "And I know everything about you I don't wanna live without you I'm only up when you're not down" +
                "Don't wanna fly if you're still on the ground It's like no matter what I do Well, you drive me crazy half the time" +
                "The other half, I'm only tryin' to Let you know that what I feel is true And I'm only me when I'm with you" +
                "Just a small-town boy and girl Livin' in a crazy world Tryna figure out what is and isn't true" +
                "And I don't try to hide my tears My secrets or my deepest fears Through it all, nobody gets me like you do" +
                "And you know everything about me You say that you can't live without me I'm only up when you're not down" +
                "Don't wanna fly if you're still on the ground It's like no matter what I do Well, you drive me crazy half the time" +
                "The other half, I'm only tryin' to Let you know that what I feel is true And I'm only me when I'm with you" +
                "When I'm with anybody else It's so hard to be myself And only you can tell That I'm only up when you're not down" +
                "Don't wanna fly if you're still on the ground It's like no matter what I do Well, you drive me crazy half the time" +
                "The other half, I'm only tryin' to Let you know that what I feel is true And I'm only me Who I wanna be" +
                "Well, I'm only me when I'm with you With you Uh-huh-huh, yeah ";
        lyrics[12]="She can't see the way your eyes Light up when you smile She'll never notice how you stop and stare" +
                "Whenever she walks by And you can't see me wanting you the way you want her But you are everything to me" +
                "And I just wanna show you She don't even know you She's never gonna love you like I want to And you just see right through me" +
                "But if you only knew me We could be a beautiful miracle, unbelievable Instead of just invisible" +
                "Oh, yeah, oh There's a fire inside of you That can't help but shine through She's never gonna see the light" +
                "No matter what you do And all I think about is how to make you think of me And everything that we could be" +
                "And I just wanna show you She don't even know you She's never gonna love you like I want to And you just see right through me" +
                "But if you only knew me We could be a beautiful miracle, unbelievable Instead of just invisible" +
                "Like shadows in a faded light Oh, we're invisible I just wanna open your eyes And make you realize" +
                "I just wanna show you She don't even know you Baby, let me love you, let me want you You just see right through me" +
                "But if you only knew me We could be a beautiful miracle, unbelievable Instead of just invisible" +
                "Oh, yeah She can't see the way your eyes Light up when you smile ";
        lyrics[13]= "Why would you wanna break A perfectly good heart? Why would you wanna take Our love and tear it all apart now?" +
                "Why would you wanna make The very first scar? Why would you wanna break A perfectly good heart?" +
                "Maybe I should've seen the signs Should've read the writing on the wall And realized by the distance in your eyes" +
                "That I would be the one to fall No matter what you say I still can't believe that you would walk away" +
                "It don't make sense to me, but Why would you wanna break A perfectly good heart? Why would you wanna take" +
                "Our love and tear it all apart now? Why would you wanna make The very first scar? Why would you wanna break" +
                "A perfectly good heart? It's not unbroken anymore (It's not unbroken anymore) How do I get it back the way it was before?" +
                "Why would you wanna break A perfectly good heart? Why would you wanna take Our love and tear it all apart now?" +
                "Why would you wanna make The very first scar? Why would you wanna break— (Why) Would you wanna break it?" +
                "Why would you wanna break A perfectly good heart? Why would you wanna take Our love and tear it all apart now?" +
                "Why would you wanna make The very first scar? Why would you wanna break A perfectly good heart?" +
                "Mmm-hmm ";

        //Everything in lowercase
        for(int j = 0; j < tracksNumber; j++){
            lyrics[j]=lyrics[j].toLowerCase();
        }
    }

    public void search(String str, String[] solution){
        boolean debutbool = false;
        for(int i = 0; i<this.tracksNumber; i++){
            if(this.lyrics[i].contains(str)){
                if(debutbool){
                    solution[1]+= ", "+this.titles[i];
                    solution[0]+= ", "+i;
                }else{
                    debutbool= true;
                    solution[1]+= this.album+ ": "+this.titles[i];
                    solution[0]+= this.album+ ": "+ i;
                }
            }
        }
        solution[0]+="\n";
        solution[1]+="\n";
    }
}
