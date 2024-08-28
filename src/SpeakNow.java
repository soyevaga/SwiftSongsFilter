public class SpeakNow {
    //begins in 1, index 0 unused
    String[] lyrics;
    String[] titles;
    String album;
    int tracksNumber;

    public SpeakNow() {
        tracksNumber = 22;
        lyrics = new String[tracksNumber + 1];
        album =  "Speak Now";
        titles = new String[]{"", "Mine", "Sparks Fly", "Back to December", "Speak now", "Dear John", "Mean",
                "The Story of Us", "Never Grow Up", "Enchanted", "Better Than Revenge", "Innocent", "Haunted",
                "Last Kiss", "Long Live", "Ours", "Superman", "Electric Touch", "When Emma Falls in Love",
                "I Can See You", "Castles Crumbling", "Foolish One", "Timeless"
        };
        lyrics[1] = "Ah-ah, ah-ah Ah-ah, ah-ah You were in college working part-time, waiting tables Left a small town, never looked back" +
                "I was a flight risk with a fear of falling Wondering why we bother with love if it never lasts" +
                "I say, \"Can you believe it?\" As we're lying on the couch The moment I could see it Yes, yes, I can see it now" +
                "Do you remember, we were sitting there by the water? You put your arm around me for the first time" +
                "You made a rebel of a careless man's careful daughter You are the best thing that's ever been mine" +
                "Flash forward and we're taking on the world together And there's a drawer of my things at your place" +
                "You learn my secrets and you figure out why I'm guarded You say we'll never make my parents' mistakes" +
                "But we got bills to pay We got nothing figured out When it was hard to take Yes, yes, this is what I thought about" +
                "Do you remember, we were sitting there by the water? You put your arm around me for the first time" +
                "You made a rebel of a careless man's careful daughter You are the best thing that's ever been mine" +
                "Do you remember all the city lights on the water? You saw me start to believe for the first time" +
                "You made a rebel of a careless man's careful daughter You are the best thing that's ever been mine" +
                "Oh-oh, oh And I remember that fight, 2:30 AM As everything was slipping right out of our hands" +
                "I ran out crying and you followed me out into the street Braced myself for the goodbye 'Cause it's all I've ever known" +
                "Then you took me by surprise You said, \"I'll never leave you alone\" (Oh) You said, \"I remember how we felt sitting by the water" +
                "And every time I look at you, it's like the first time I fell in love with a careless man's careful daughter" +
                "She is the best thing that's ever been mine\" Hold on, make it last Hold on, never turn back (Hold on) You made a rebel of a careless man's careful daughter" +
                "(Hold on) You are the best thing that's ever been mine Do you believe it? (Yeah, yeah, yeah)" +
                "We're gonna make it now (Yeah, yeah, yeah) And I can see it (Yeah, yeah) I can see it now ";
        lyrics[2]= "The way you move is like a full on rainstorm And I'm a house of cards You're the kind of reckless that should send me runnin'" +
                "But I kinda know that I won't get far And you stood there in front of me, just close enough to touch" +
                "Close enough to hope you couldn't see what I was thinkin' of Drop everything now, meet me in the pouring rain" +
                "Kiss me on the sidewalk, take away the pain 'Cause I see sparks fly whenever you smile Get me with those green eyes, baby, as the lights go down" +
                "Give me something that'll haunt me when you're not around 'Cause I see sparks fly whenever you smile" +
                "My mind forgets to remind me you're a bad idea You touch me once and it's really somethin' You find I'm even better than you imagined I would be" +
                "I'm on my guard for the rest of the world But with you, I know it's no good And I could wait patiently, but I really wish you would" +
                "Drop everything now, meet me in the pouring rain Kiss me on the sidewalk, take away the pain" +
                "'Cause I see sparks fly whenever you smile Get me with those green eyes, baby, as the lights go down" +
                "Give me something that'll haunt me when you're not around 'Cause I see sparks fly whenever you smile" +
                "I'll run my fingers through your hair and watch the lights go wild Just keep on keepin' your eyes on me" +
                "It's just wrong enough to make it feel right And lead me up the staircase, won't you whisper soft and slow?" +
                "I'm captivated by you, baby, like a fireworks show Drop everything now, meet me in the pouring rain" +
                "Kiss me on the sidewalk (Ah-ah), take away the pain 'Cause I see sparks fly whenever you smile" +
                "Get me with those green eyes, baby, as the lights go down Give me something that'll haunt me when you're not around" +
                "'Cause I see sparks fly whenever you smile And the sparks fly Oh, baby, smile And the sparks fly";
        lyrics[3]= "I'm so glad you made time to see me How's life? Tell me, how's your family? I haven't seen them in a while" +
                "You've been good, busier than ever We small talk, work and the weather Your guard is up and I know why" +
                "Because the last time you saw me Is still burned in the back of your mind You gave me roses and I left them there to die" +
                "So, this is me swallowing my pride Standin' in front of you sayin', \"I'm sorry for that night\"" +
                "And I go back to December all the time It turns out freedom ain't nothing but missin' you Wishin' I'd realized what I had when you were mine" +
                "I go back to December, turn around and make it alright I go back to December all the time These days, I haven't been sleeping" +
                "Stayin' up, playing back myself leavin' When your birthday passed and I didn't call Then I think about summer, all the beautiful times" +
                "I watched you laughin' from the passenger side And realized I loved you in the fall And then the cold came, the dark days" +
                "When fear crept into my mind You gave me all your love and all I gave you was goodbye So, this is me swallowing my pride" +
                "Standin' in front of you, sayin', \"I'm sorry for that night\" And I go back to December all the time" +
                "It turns out freedom ain't nothing but missin' you Wishin' I'd realized what I had when you were mine" +
                "I go back to December, turn around and change my own mind I go back to December all the time" +
                "I miss your tanned skin, your sweet smile So good to me, so right And how you held me in your arms that September night" +
                "The first time you ever saw me cry Maybe this is wishful thinkin' Probably mindless dreaming" +
                "But if we loved again, I swear I'd love you right I'd go back in time and change it, but I can't" +
                "So, if the chain is on your door, I understand But this is me swallowing my pride Standin' in front of you, sayin', \"I'm sorry for that night\"" +
                "And I go back to December It turns out freedom ain't nothing but missin' you Wishin' I'd realized what I had when you were mine" +
                "I go back to December, turn around and make it alright I go back to December, turn around and change my own mind" +
                "I go back to December all the time All the time ";
        lyrics[4]= "I am not the kind of girl Who should be rudely bargin' in on a white veil occasion But you are not the kind of boy" +
                "Who should be marrying the wrong girl I sneak in and see your friends And her snotty little family all dressed in pastel" +
                "And she is yelling at a bridesmaid Somewhere back inside a room Wearin' a gown shaped like a pastry" +
                "This is surely not what you thought it would be I lose myself in a daydream Where I stand and say" +
                "Don't say yes, run away now I'll meet you when you're out Of the church, at the back door Don't wait or say a single vow" +
                "You need to hear me out And they said, \"Spеak now\" Fond gestures are еxchanged And the organ starts to play a song that sounds like a death march" +
                "And I am hiding in the curtains It seems that I was uninvited by your lovely bride-to-be She floats down the aisle like a pageant queen" +
                "But I know you wish it was me You wish it was me, don't you? Don't say yes, run away now I'll meet you when you're out" +
                "Of the church, at the back door Don't wait or say a single vow You need to hear me out And they said,  \"Speak now\"" +
                "Don't say yes, run away now (Run away now) I'll meet you when you're out Of the church, at the back door" +
                "Don't wait or say a single vow (Say a single vow) Your time is running out And they said,  \"Speak now\"" +
                "Ooh (Run away now), la Ooh (Say a single vow), ooh I hear the preacher say \"Speak now or forever hold your peace\"" +
                "There's the silence, there's my last chance I stand up with shaky hands, all eyes on me Horrified looks from everyone in the room" +
                "But I'm only lookin' at you I am not the kind of girl Who should be rudely bargin' in on a white veil occasion" +
                "But you are not the kind of boy Who should be marrying the wrong girl, haha So, don't say yes, run away now" +
                "I'll meet you when you're out Of the church, at the back door Don't wait or say a single vow" +
                "You need to hear me out They said,  \"Speak now\" And you say, \"Let's run away now (Run away now)" +
                "I'll meet you when I'm out Of my tux, at the back door Baby, I didn't say my vows (Say a single vow)" +
                "So glad you were around When they said, 'Speak now'\" ";
        lyrics[5]="Long were the nights When my days once revolved around you Counting my footsteps Prayin' the floor won't fall through again" +
                "And my mother accused me of losin' my mind But I swore I was fine You paint me a blue sky Then go back and turn it to rain" +
                "And I lived in your chess game But you change the rules every day Wonderin' which version of you" +
                "I might get on the phone tonight Well, I stopped pickin' up And this song is to let you know why" +
                "Dear John, I see it all now that you're gone Don't you think I was too young to be messed with?" +
                "The girl in the dress cried the whole way home I shoulda known Well, maybe it's me and my blind optimism to blame" +
                "Or maybe it's you and your sick need To give love and take it away And you'll add my name to your long list of traitors" +
                "Who don't understand And I'll look back and regret how I ignored when they said \"Run as fast as you can\"" +
                "Dear John, I see it all now that you're gone Don't you think I was too young to be messed with?" +
                "The girl in the dress cried the whole way home Dear John, I see it all now, it was wrong Don't you think nineteen's too young to be played by" +
                "Your dark, twisted games when I loved you so? I shoulda known You are an expert at \"Sorry\" and keepin' lines blurry" +
                "Never impressed by me acing your tests All the girls that you run dry have tired, lifeless eyes" +
                "'Cause you burned them out But I took your matches before fire could catch me So don't look now" +
                "I'm shining like fireworks over your sad, empty town Oh Dear John, I see it all now that you're gone" +
                "Don't you think I was too young to be messed with? The girl in the dress cried the whole way home" +
                "I see it all now that you're gone Don't you think I was too young to be messed with? The girl in the dress wrote you a song" +
                "You shoulda known You shoulda known Don't you think I was too young? You shoulda known ";
        lyrics[6]= "You, with your words like knives And swords and weapons that you use against me You have knocked me off my feet again" +
                "Got me feelin' like a nothing You, with your voice like nails on a chalkboard Calling me out when I'm wounded" +
                "You, pickin' on the weaker man Well, you can take me down With just one single blow But you don't know what you don't know" +
                "Someday, I'll be livin' in a big ole city And all you're ever gonna be is mean Someday, I'll be big enough so you can't hit me" +
                "And all you're ever gonna be is mean Why you gotta be so mean? You, with your switching sides" +
                "And your wildfire lies and your humiliation You have pointed out my flaws again As if I don't already see them" +
                "I walk with my head down, trying to block you out 'Cause I'll never impress you I just wanna feel okay again" +
                "I bet you got pushed around Somebody made you cold But the cycle ends right now 'Cause you can't lead me down that road" +
                "And you don't know what you don't know Someday, I'll be livin' in a big ole city And all you're ever gonna be is mean" +
                "Someday, I'll be big enough so you can't hit me And all you're ever gonna be is mean Why you gotta be so mean?" +
                "And I can see you years from now in a bar Talking over a football game With that same big, loud opinion, but nobody's listening" +
                "Washed up and ranting about the same ole bitter things Drunk and grumbling on about how I can't sing" +
                "But all you are is mean All you are is mean And a liar, and pathetic And alone in life, and mean" +
                "And mean, and mean, and mean But someday, I'll be livin' in a big ole city And all you're ever gonna be is mean, yeah" +
                "Someday, I'll be big enough so you can't hit me And all you're ever gonna be is mean Why you gotta be so mean?" +
                "Someday, I'll be livin' in a big ole city (Why you gotta be so mean?) And all you're ever gonna be is mean" +
                "(Why you gotta be so mean?) Someday, I'll be big enough so you can't hit me (Why you gotta be so mean?)" +
                "And all you're ever gonna be is mean Why you gotta be so mean? ";
        lyrics[7]= "I used to think one day we'd tell the story of us How we met and the sparks flew instantly And people would say, \"They’re the lucky ones\"" +
                "I used to know my place was the spot next to you Now I'm searchin' the room for an empty seat" +
                "’Cause lately I don't even know what page you're on Oh, a simple complication Miscommunications lead to fallout" +
                "So many things that I wish you knew So many walls up, I can't break through Now I'm standin' alone in a crowded room" +
                "And we're not speakin' And I’m dyin’ to know, is it killin' you Like it’s killin' me? Yeah I don't know what to say since thе twist of fate" +
                "When it all broke down And thе story of us looks a lot like a tragedy now Next chapter How'd we end up this way?" +
                "See me nervously pulling at my clothes and tryin’ to look busy And you're doin' your best to avoid me" +
                "I'm starting to think one day I'll tell the story of us How I was losin' my mind when I saw you here" +
                "But you held your pride like you should've held me Oh, I'm scared to see the ending Why are we pretending this is nothin'?" +
                "I'd tell you I miss you, but I don't know how I've never heard silence quite this loud Now I'm standin' alone in a crowded room" +
                "And we're not speakin' And I'm dyin' to know, is it killin' you Like it's killin' me? Yeah I don't know what to say since the twist of fate" +
                "When it all broke down And the story of us looks a lot like a tragedy now This is looking like a contest" +
                "Of who can act like they care less But I liked it better when you were on my side The battle's in your hands now" +
                "But I would lay my armor down If you said you'd rather love than fight So many things that you wish I knew" +
                "But the story of us might be ending soon Now I'm standin' alone in a crowded room And we're not speakin'" +
                "And I'm dyin' to know, is it killin' you Like it's killin' me? Yeah And I don't know what to say since the twist of fate" +
                "When it all broke down And the story of us looks a lot like a tragedy now, now, now And we're not speakin'" +
                "And I'm dyin' to know, is it killin' you Like it's killin' me? Yeah I don't know what to say since the twist of fate" +
                "'Cause we're goin' down And the story of us looks a lot like a tragedy now The end ";
        lyrics[8]= "Your little hand's wrapped around my finger And it's so quiet in the world tonight Your little eyelids flutter 'cause you're dreaming" +
                "So I tuck you in, turn on your favorite nightlight To you, everything's funny You got nothing to regret" +
                "I'd give all I have, honey If you could stay like that Oh, darling, don't you ever grow up Don't you ever grow up, just stay this little" +
                "Oh, darling, don't you ever grow up Don't you ever grow up, it could stay this simple I won't let nobody hurt you" +
                "Won't let no one break your heart And no one will desert you Just try to never grow up And never grow up" +
                "You're in the car, on the way to the movies And you're mortified your mom's droppin' you off" +
                "At fourteen, there's just so much you can't do And you can't wait to move out someday and call your own shots" +
                "But don't make her drop you off around the block Remember that she's gettin' older, too And don't lose the way that you dance around" +
                "In your PJs getting ready for school Oh, darling, don't you ever grow up Don't you ever grow up, just stay this little" +
                "Oh, darling, don't you ever grow up Don't you ever grow up, it could stay this simple And no one's ever burned you" +
                "Nothing's ever left you scarred And even though you want to Just try to never grow up Take pictures in your mind of your childhood room" +
                "Memorize what it sounded like when your dad gets home Remember the footsteps, remember the words said" +
                "And all your little brother's favorite songs I just realized everything I have is, someday, gonna be gone" +
                "So, here I am in my new apartment In a big city, they just dropped me off It's so much colder than I thought it would be" +
                "So I tuck myself in and turn my nightlight on Wish I'd never grown up Wish I'd never grown up" +
                "Oh, I don't wanna grow up Wish I'd never grown up, I could still be little Oh, I don't wanna grow up" +
                "Wish I'd never grown up, it could still be simple Oh, darling, don't you ever grow up Don't you ever grow up, just stay this little" +
                "Oh, darling, don't you ever grow up Don't you ever grow up, it could stay this simple I won't let nobody hurt you (Never grow up)" +
                "Won't let no one break your heart And even though you want to Please, try to never grow up Oh, oh (Never grow up)" +
                "Just never grow up Oh (Never grow up) Just never grow up ";
        lyrics[9]= "There I was again tonight Forcing laughter, faking smiles Same old tired, lonely place Walls of insincerity" +
                "Shifting eyes and vacancy Vanished when I saw your face All I can say is it was enchanting to meet you" +
                "Your eyes whispered, \"Have we met?\" Across the room, your silhouette Starts to make its way to me" +
                "The playful conversation starts Counter all your quick remarks Like passing notes in secrecy" +
                "And it was enchanting to meet you All I can say is I was enchanted to meet you This night is sparklin', don't you let it go" +
                "I'm wonderstruck, blushin' all the way home I'll spеnd forever wonderin' if you knеw I was enchanted to meet you" +
                "The lingering question kept me up 2 a.m., who do you love? I wonder 'til I'm wide awake And now, I'm pacing back and forth" +
                "Wishing you were at my door I'd open up and you would say \"Hey, it was enchanting to meet you\"" +
                "All I know is I was enchanted to meet you This night is sparklin', don't you let it go I'm wonderstruck, blushin' all the way home" +
                "I'll spend forever wonderin' if you knew This night is flawless, don't you let it go I'm wonderstruck, dancing around all alone" +
                "I'll spend forever wonderin' if you knew I was enchanted to meet you This is me praying that" +
                "This was the very first page Not where the storyline ends My thoughts will echo your name Until I see you again" +
                "These are the words I held back As I was leaving too soon I was enchanted to meet you Please, don't be in love with someone else" +
                "Please, don't have somebody waitin' on you Please, don't be in love with someone else (Ooh)" +
                "Please, don't have somebody waitin' on you (Oh-oh) This night is sparklin', don't you let it go" +
                "I'm wonderstruck, blushin' all the way home I'll spend forever wonderin' if you knew This night is flawless (Please, don't be in love with someone else)" +
                "Don't you let it go I'm wonderstruck (Please, don't have somebody waitin' on you) Dancing around all alone" +
                "I'll spend forever (Please, don't be in love with someone else) Wonderin' if you knew I was enchanted to meet you" +
                "Please, don't be in love with someone else Please, don't have somebody waitin' on you ";
        lyrics[10]= "Now go stand in the corner and think about what you did (Ha) Haha, time for a little revenge" +
                "The story starts when it was hot and it was summer, and I had it all, I had him right there where I wanted him" +
                "She came along, got him alone, and let's hear the applause She took him faster than you can say \"Sabotage\"" +
                "I never saw it coming, wouldn't have suspected it I underestimated just who I was dealing with (Oh)" +
                "She had to know the pain was beating on me like a drum She underestimated just who she was stealin' from" +
                "She's not a saint and she's not what you think She's an actress, woah She's better known for the things that she does" +
                "On the mattress, whoa He was a moth to the flame" +
                "She was holding the matches, woah Soon, she's gonna find stealing other people's toys On the playground won't make you many friends" +
                "She should keep in mind, she should keep in mind There is nothing I do better than revenge (Revenge), ha" +
                "She looks at life like it's a party and she's on the list She looks at me like I'm a trend and she's so over it" +
                "I think her ever-present frown is a little troubling, and She thinks I'm psycho 'cause I like to rhyme her name with things" +
                "But sophistication isn't what you wear or who you know Or pushing people down to get you where you wanna go" +
                "They didn't teach you that in prep school so it's up to me That no amount of vintage dresses gives you dignity" +
                "(Think about what you did) She's not a saint and she's not what you think She's an actress, woah She's better known for the things that she does" +
                "On the mattress, whoa" +
                "He was a moth to the flame She was holding the matches, woah Soon, she's gonna find stealing other people's toys" +
                "On the playground won't make you many friends She should keep in mind, she should keep in mind" +
                "There is nothing I do better than revenge (Haha) I'm just another thing for you to roll your eyes at, honey" +
                "You might have him, but haven't you heard? I'm just another thing for you to roll your eyes at, honey" +
                "You might have him, but I always get the last word Woah (Come on, can you take it back? Come on)" +
                "She's not a saint and she's not what you think (No) She's an actress, woah (You know that you deserve this)" +
                "She's better known for the things that she does On the mattress, whoa" +
                "He was a moth to the flame She was holding the matches, woah Soon, she's gonna find stealing other people's toys" +
                "On the playground won't make you many friends She should keep in mind, she should keep in mind" +
                "There is nothing I do better than revenge (Come on) Do you still feel like you know what you're doin'?" +
                "'Cause I don't think you do, oh (No, no, no, no) Do you still feel like you know what you're doing? (No)" +
                "I don't think you do, I don't think you do Let's hear the applause (Come on, come on) Come on, show me how much better you are (Oh, oh)" +
                "(So much better, yeah?) So you deserve some applause 'Cause you're so much better She took him faster than you could say \"Sabotage\"";
        lyrics[11]= "I guess you really did it this time Left yourself in your war path Lost your balance on a tightrope" +
                "Lost your mind tryin' to get it back Wasn't it easier in your lunchbox days? Always a bigger bed to crawl into" +
                "Wasn't it beautiful when you believed in everything And everybody believed in you? It's alright, just wait and see" +
                "Your string of lights are still bright to me, oh Who you are is not where you've been You're still an innocent" +
                "You're still an innocent Did some things you can't speak of But at night, you live it all again" +
                "You wouldn't be shattered on the floor now If only you had seen what you know now then Wasn't it easier in your firefly-catching days?" +
                "When everything out of reach Someone bigger brought down to you Wasn't it beautiful running wild 'til you fell asleep" +
                "Before the monsters caught up to you? It's alright, just wait and see Your string of lights are still bright to me, oh" +
                "Who you are is not where you've been You're still an innocent It's okay, life is a tough crowd" +
                "Thirty-two and still growing up now Who you are is not what you did You're still an innocent" +
                "Time turns flames to embers You'll have new Septembers Every one of us has messed up, too, ooh" +
                "Minds change like the weather I hope you remember Today is never too late to be brand new Oh, oh" +
                "It's alright, just wait and see Your string of lights is still bright to me, oh Who you are is not where you've been" +
                "You're still an innocent It's okay, life is a tough crowd Thirty-two and still growing up now" +
                "Who you are is not what you did You're still an innocent You're still an innocent Lost your balance on a tightrope, oh" +
                "It's never too late to get it back ";
        lyrics[12]= "You and I walk a fragile line I have known it all this time But I never thought I'd live to see it break" +
                "It's getting dark and it's all so quiet And I can't trust anything now And it's coming over you like it's all a big mistake" +
                "Oh, holding my breath Won't lose you again Something's made your eyes go cold Come on, come on, don't leave me like this" +
                "I thought I had you figured out Something's gone terribly wrong You're all I wanted Come on, come on, don't leave me like this" +
                "I thought I had you figured out Can't breathe whenever you're gone Can't turn back now, I'm haunted" +
                "Stood there and watched you walk away From everything we had But I still mean every word I said to you" +
                "He will try to take away my pain And he just might make me smile But the whole time, I'm wishing he was you instead" +
                "Oh, holding my breath Won't see you again Something keeps me holding onto nothing Come on, come on, don't leave me like this" +
                "I thought I had you figured out Something's gone terribly wrong You're all I wanted Come on, come on, don't leave me like this" +
                "I thought I had you figured out Can't breathe whenever you're gone Can't turn back now, I'm haunted" +
                "I know, I know I just know You're not gone You can't be gone, no Come on, come on, don't leave me like this" +
                "I thought I had you figured out Something's gone terribly wrong (Terribly wrong) Won't finish what you started" +
                "Come on, come on, don't leave me like this I thought I had you figured out Can't breathe whenever you're gone" +
                "I can't go back, I'm haunted Oh You and I walk a fragile line I have known it all this time Never ever thought I'd see it break" +
                "Never thought I'd see it ";
        lyrics[13]="I still remember the look on your face Lit through the darkness at 1:58 The words that you whispered for just us to know" +
                "You told me you loved me, so why did you go away? Away I do recall now, the smell of the rain" +
                "Fresh on the pavement, I ran off the plane That July ninth, the beat of your heart It jumps through your shirt, I can still feel your arms" +
                "But now I'll go Sit on the floor wearin' your clothes All that I know is I don't know How to be somethin' you miss" +
                "I never thought we'd have a last kiss I never imagined we'd end like this Your name, forever the name on my lips" +
                "I do remember the swing of your step The life of the party, you're showin' off again And I'd roll my eyes and then you'd pull me in" +
                "I'm not much for dancin', but for you, I did Because I love your handshake meetin' my father" +
                "I love how you walk with your hands in your pockets How you'd kiss me when I was in the middle of saying something" +
                "There's not a day I don't miss those rude interruptions And I'll go Sit on the floor wearin' your clothes" +
                "All that I know is I don't know How to be somethin' you miss I never thought we'd have a last kiss" +
                "I never imagined we'd end like this Your name, forever the name on my lips, mmm So I'll watch your life in pictures like I used to watch you sleep" +
                "And I feel you forget me like I used to feel you breathe And I'll keep up with our old friends just to ask them how you are" +
                "Hope it's nice where you are And I hope the sun shines and it's a beautiful day And something reminds you you wish you had stayed" +
                "You can plan for a change in the weather and time But I never planned on you changing your mind" +
                "So I'll go Sit on the floor wearin' your clothes All that I know is I don't know How to be somethin' you miss" +
                "I never thought we'd have a last kiss I never imagined we'd end like this Your name, forever the name on my lips" +
                "Just like our last kiss Forever the name on my lips Forever the name on my lips Just like our last";
        lyrics[14]= "I said, \"Remember this moment\" In the back of my mind The time we stood with our shaking hands" +
                "The crowds in stands went wild We were the kings and the queens And they read off our names The night you danced like you knew our lives" +
                "Would never be the same You held your head like a hero On a history book page It was the end of a decade" +
                "But the start of an age Long live the walls we crashеd through How the kingdom lights shined just for me and you" +
                "I was scrеaming, \"Long live all the magic we made\" And bring on all the pretenders One day, we will be remembered" +
                "I said, \"Remember this feeling\" I pass the pictures around Of all the years that we stood there on the sidelines" +
                "Wishin' for right now We are the kings and the queens You traded your baseball cap for a crown" +
                "When they gave us our trophies And we held them up for our town And the cynics were outraged" +
                "Screaming, \"This is absurd\" 'Cause for a moment, a band of thieves In ripped up jeans got to rule the world" +
                "Long live the walls we crashed through How the kingdom lights shined just for me and you I was screaming, \"Long live all the magic we made\"" +
                "And bring on all the pretenders, I'm not afraid Long live all the mountains we moved I had the time of my life fighting dragons with you" +
                "I was screaming, \"Long live that look on your face\" And bring on all the pretenders One day, we will be remembered" +
                "Hold on to spinning around Confetti falls to the ground May these memories break our fall Will you take a moment? Promise me this" +
                "That you'll stand by me forever But if, God forbid, fate should step in And force us into a goodbye" +
                "If you have children some day When they point to the pictures Please, tell 'em my name Tell 'em how the crowds went wild" +
                "Tell 'em how I hope they shine Long live the walls we crashed through I had the time of my life with you" +
                "Long, long live the walls we crashed through How the kingdom lights shined just for me and you" +
                "And I was screaming, \"Long live all the magic we made\" And bring on all the pretenders, I'm not afraid" +
                "Singing, \"Long live all the mountains we moved\" I had the time of my life fighting dragons with you" +
                "And long, long live that look on your face And bring on all the pretenders One day, we will be remembered";
        lyrics[15]= "Elevator buttons and morning air Strangers' silence makes me want to take the stairs If you were here, we'd laugh about their vacant stares" +
                "But right now, my time is theirs Seems like there's always someone who disapproves They'll judge it like they know about me and you" +
                "And the verdict comes from those with nothing else to do The jury's out, but my choice is you" +
                "So don't you worry your pretty little mind People throw rocks at things that shine And life makes love look hard" +
                "The stakes are high, the water's rough But this love is ours You never know what people have up their sleeves" +
                "Ghosts from your past gonna jump out at me Lurking in the shadows with their lip gloss smiles" +
                "But I don't care, 'cause right now, you're mine And you'll say Don't you worry your pretty little mind" +
                "People throw rocks at things that shine And life makes love look hard The stakes are high, the water's rough" +
                "But this love is ours And it's not theirs to speculate if it's wrong and Your hands are tough, but they are where mine belong and" +
                "I'll fight their doubt and give you faith with this song for you 'Cause I love the gap between your teeth" +
                "And I love the riddles that you speak And any snide remarks from my father about your tattoos" +
                "Will be ignored, 'cause my heart is yours So don't you worry your pretty little mind People throw rocks at things that shine" +
                "And life makes love look hard Don't you worry your pretty little mind People throw rocks at things that shine" +
                "But they can't take what's ours They can't take what's ours The stakes are high, the water's rough" +
                "But this love is ours ";
        lyrics[16]= "Tall, dark, and superman He puts papers in his briefcase and drives away To save the world or go to work" +
                "It's the same thing to me He's got his mother's eyes, his father's ambition I wonder if he knows how much that I miss him" +
                "I hang on every word you say And you smile and say, \"How are you?\" And I'll say, \"Just fine\"" +
                "I always forget to tell you, \"I love you\" I love you forever I watch Superman fly away You've got a busy day today" +
                "Go save the world, I'll be around And I watch Superman fly away Come back, I'll be with you someday" +
                "I'll be right here on the ground When you come back down Tall, dark and beautiful He's complicated, he's irrational" +
                "But I hope someday you'll take me away, and save the day, yeah Something in his deep brown eyes has me sayin'" +
                "He's not all bad like his reputation And I can't hear one single word they say And you'll leave, got places to be, and I'll be okay" +
                "I always forget to tell you, \"I love you\" I loved you from the very first day I watch Superman fly away" +
                "You've got a busy day today Go save the world, I'll be around And I watch Superman fly away Come back, I'll be with you someday" +
                "I'll be right here on the ground When you come back down And I watch you fly around the world" +
                "And I hope you don't save some other girl Don't forget, don't forget about me I'm far away, but I never let you go" +
                "I'm love-struck and looking out the window Don't forget, don't forget where I'll be Right here, wishing the flowers were from you" +
                "Wishing the card was from you Wishing the call was from you 'Cause I loved you from the very first day" +
                "I watch Superman fly away You've got a busy day today Go save the world, I'll be around Forever and ever" +
                "And I watch Superman fly away I swear, I'll be with you someday I'll be right here on the ground" +
                "When you come back down La, la, la, la, la, la La, la, la, la, la, la When you come back down";
        lyrics[17]= "Just breathe, just relax, it'll be okay Just an hour 'til your car's in the driveway Just the first time ever hangin' out with you tonight" +
                "I've got my money on things goin' badly Got a history of stories ending sadly Still hoping that the fire won't burn me" +
                "Just one time, just one time All I know is this could either break my heart or bring it back to life" +
                "Got a feelin' your electric touch could fill this ghost town up with life And I want you now, wanna need you forever" +
                "In the heat of your electric touch, mmm I've been left in the rain lost and pining I'm tryin' hard not to look like I'm trying" +
                "'Cause every time I tried hard for love, it fell apart (Woah) I've gotten used to no one callin' my phone" +
                "I've grown accustomed to sleepin' alone Still, I know that all it takes is to get it right Just one time, just one time" +
                "All I know is this could either break my heart or bring it back to life Got a feelin' your electric touch could fill this ghost town up with life" +
                "And I want you now, wanna need you forever In the heat of your electric touch, mmm I was thinking just one time (Just one time)" +
                "Maybe the stars align (Just one time) And maybe I call you mine And you won't need space Or string me along while you decide" +
                "And just one time (Just one time) Maybe the moment's right (The moment's right) It's 8:05 and I see two headlights" +
                "All I know is this could either break my heart or bring it back to life Got a feelin' your electric touch (Ooh)" +
                "All I know is this could either break my heart or bring it back to life Got a feelin' your electric touch could fill this ghost town up with life (Life)" +
                "And I want you now, wanna need you forever In the heat of your electric touch, mmm ";
        lyrics[18]= "When Emma falls in love, she paces the floor Closes the blinds and locks the door When Emma falls in love, she calls up her mom" +
                "Jokes about the ways that this one could go wrong She waits and takes her time 'Cause Little Miss Sunshine always thinks it's gonna rain" +
                "When Emma falls in love, I know That boy will never be the same 'Cause she's the kind of book that you can't put down" +
                "Like if Cleopatra grew up in a small town And all the bad boys would be good boys If they only had a chance to love her" +
                "And to tell you the truth, sometimes I wish I was her When Emma falls in love, it's all on her face" +
                "Hangs in the air like stars in outer space When Emma falls in love, she disappears And we all just laugh after seein' it all these years" +
                "When Emma falls apart, it's when she's alone She takes on the pain and bears it on her own 'Cause when Emma falls in love, she's in it for keeps" +
                "She won't walk away unless she knows she absolutely has to leave And she's the kind of book that you can't put down" +
                "Like if Cleopatra grew up in a small town And all the bad boys would be good boys If they only had a chance to love her" +
                "And to tell you the truth, sometimes I wish I was her Well, she's so New York when she's in L.A.​​" +
                "She won't lose herself in love the way that I did 'Cause she'll call you out, she'll put you in your place" +
                "When Emma falls in love, I'm learning Emma met a boy with eyes like a man Turns out her heart fits right in the palm of his hand" +
                "Now he'll be her shelter when it rains Little does he know, his whole world's about to change" +
                "'Cause she's the kind of book that you can't put down Like if Cleopatra grew up in a small town" +
                "And all the bad boys would be good boys If they only had a chance to love her And to tell you the truth, sometimes I wish I was her" +
                "Yeah, between me and you, sometimes I wish I was her ";
        lyrics[19]= "I-I-I-I You brush past me in the hallway And you don't think I, I, I can see ya, do ya? I’ve been watchin' you for ages" +
                "And I spend my time tryin' not to feel it But what would you do if I went to touch you now?" +
                "What would you do if they never found us out? What would you do if we never made a sound? ’Cause I can see you waitin' down the hall from me" +
                "And I could see you up against the wall with me And what would you do? Baby, if you only knew" +
                "That I can see you I-I-I-I And we kept everything professional But something's changed, it's somethin' I, I like" +
                "They keep watchful eyes on us So it's best that we move fast and keep quiet You won't believe half the things I see inside my head" +
                "Wait 'til you see half the things that haven’t happened yet But what would you do if I went to touch you now?" +
                "What would you do if they never found us out? What would you do if we never made a sound? ’Cause I can see you waitin' down the hall from me" +
                "And I could see you up against the wall with me And what would you do? Baby, if you only knew, oh, oh, oh" +
                "That I could see you throw your jacket on the floor I could see you, make me want you even more" +
                "What would you do? Baby, if you only knew That I can see you I-I-I-I I can see you in your suit and your necktie" +
                "Passed me a note sayin’, \"Meet me tonight\" Then we kiss and you know I won't ever tell, yeah" +
                "And I could see you being my addiction You can see me as a secret mission Hide away and I will start behaving myself" +
                "I-I-I-I Oh-oh, oh, oh I can see you waitin' down the hall from me And I could see you up against the wall with me" +
                "And what would you do? Baby, if you only knew, oh That I could see you throw your jacket on the floor" +
                "I could see you, make me want you even more What would you do? Baby, if you only knew That I can see you, oh, I can see you" +
                "Oh, I see you, I see you, baby I see you (I-I-I-I) I see you, I see you, baby Oh, baby ";
        lyrics[20]= "(Once, I had an empire) (Once, I had an empire) (Once, I had an empire) Once, I had an empire in a golden age" +
                "I was held up so high, I used to be great They used to cheer when they saw my face Now, I fear I have fallen from grace" +
                "And I feel like my castle's crumbling down And I watch all my bridges burn to the ground And you don't want to know me, I will just let you down" +
                "You don't wanna know me now Once, I was the great hope for a dynasty Crowds would hang on my words and they trusted me" +
                "Their faith was strong, but I pushed it too far I held that grudge 'til it tore me apart Power went to my head and I couldn't stop" +
                "Ones I loved tried to help, so I ran them off And here I sit alone behind walls of regret Falling down like promises that I never kept" +
                "And I feel like my castle's crumbling down And I watch all my bridges burn to the ground And you don't want to know me, I will just let you down" +
                "You don't wanna know me now My foes and friends watch my reign end I don't know how it could've ended this way" +
                "Smoke billows from my ships in the harbor People look at me like I'm a monster Now they're screamin' at the palace front gates" +
                "Used to chant my name Now they're screaming that they hate me Never wanted you to hate me My castle's crumbling down" +
                "And I watch all my bridges burn to the ground And you don't want to know me, I will just let you down (Just let you down)" +
                "My castle's crumbling down You don't wanna know me now, now (Once, I had an empire) (Once, I had an empire)" +
                "(Once, I had an empire) ";
        lyrics[21]= "My cards are on the table, yours are in your hand Chances are, tonight, you've already got plans" +
                "And chances are I will talk myself to sleep again You give me just enough attention to keep my hopes too high" +
                "Wishful thoughts forget to mention when something's really not right And I will block out these voices of reason in my head" +
                "And the voices say, \"You are not the exception You will never learn your lesson\" Foolish one" +
                "Stop checkin' your mailbox for confessions of love That ain't never gonna come You will take the long way, you will take the long way down" +
                "You know how to keep me waitin' I know how to act like I'm fine Don't know what to call this situation" +
                "But I know I can't call you mine And it's delicate, but I will do my best to seem bulletproof" +
                "'Cause when my head is on your shoulder It starts thinkin' you'll come around And maybe, someday, when we're older" +
                "This is something we'll laugh about Over coffee every mornin' while you're watching the news" +
                "But then the voices say, \"You are not the exception You will never learn your lesson\" Foolish one" +
                "Stop checkin' your mailbox for confessions of love That ain't never gonna come You will take the long way, you will take the long way down" +
                "Foolish one Stop checkin' your mailbox for confessions of love That ain't never gonna come You will learn the hard way instead of just walkin' out" +
                "Now I'm slidin' down the wall with my head in my hands Sayin', \"How could I not see the signs?\"" +
                "Oh, you haven't written me or called But goodbye screamin' in the silence And the voices in my head are tellin' me why" +
                "'Cause you got her on your arm and me in the wings I'll get your longing glances, but she'll get your ring" +
                "And you will say you had the best of intentions And maybe I will finally learn my lesson Foolish one" +
                "Stop checkin' your mailbox for confessions of love That ain't never gonna come You will take the long way, you will take the long way down" +
                "Foolish one Stop checkin' your mailbox for confessions of love That ain't never gonna come You will learn the hard way instead of just walkin' out, oh-oh, oh, oh" +
                "Outro] La-la-la-la-la, la-la-la-la, oh La-la-la-la-la Ain't never gonna come Ooh, you will learn the hard way now" +
                "Foolish one Sittin' 'round waiting for confessions of love They ain't never gonna come And thinkin' he's the one, you should've been walkin' out" +
                "Foolish one The day is gonna come for your confessions of love When all is said and done, he just wasn't the one" +
                "No, he just wasn't the one ";
        lyrics[22]= "Down the block, there's an antique shop And something in my head said, \"Stop,\" so I walked in" +
                "On the counter was a cardboard box And the sign said, \"Photos: twenty-five cents each\" Black and white, saw a 30s bride" +
                "And school lovers laughin' on the porch of their first house The kinda love that you only find once in a lifetime" +
                "The kind you don't put down And that's when I called you and it's so hard to explain But in those photos, I saw us instead" +
                "And, somehow, I know that you and I would've found each other In another life, you still would've turned my head even if wе'd met" +
                "On a crowded street in 1944 And you werе headed off to fight in the war You still would've been mine" +
                "We would have been timeless I would've read your love letters every single night And prayed to God you'd be comin' home all right" +
                "And you would've been fine We would have been timeless 'Cause I believe that we were supposed to find this" +
                "So, even in a different life, you still would've been mine We would've been timeless I had to smile when it caught my eye" +
                "There was one of a teenage couple in the driveway Holdin' hands on the way to a dance And the date on the back said 1958" +
                "Which brought me back to the first time I saw you Time stood still like somethin' in this old shop" +
                "I thought about it as I started lookin' 'round At these precious things that time forgot That's when I came upon a book covered in cobwebs" +
                "Story of a romance torn apart by fate Hundreds of years ago, they fell in love, like we did" +
                "And I'd die for you in the same way if I first saw your face In the 1500s, off in a foreign land" +
                "And I was forced to marry another man You still would've been mine We would have been timeless" +
                "I would've read your love letters every single night And run away and left it all behind You still would've been mine" +
                "We would've been timeless 'Cause I believe that we were supposed to find this So, even in a different life, you still would've been mine" +
                "We would've been timeless Time breaks down your mind and body Don't you let it touch your soul" +
                "It was like an age-old classic The first time that you saw me The story started when you said, \"Hello\"" +
                "In a crowded room a few short years ago And sometimes there's no proof, you just know You're always gonna be mine" +
                "We're gonna be I'm gonna love you when our hair is turnin' gray We'll have a cardboard box of photos of the life we've made" +
                "And you'll say, \"Oh my, we really were timeless\" We're gonna be timeless, timeless You still would've been mine" +
                "We would've been Even if we'd met on a crowded street in 1944 You still would've been mine We would've been" +
                "Down the block, there's an antique shop And somethin' in my head said, \"Stop,\" so I walked in";

        //Everything in lowercase
        for(int j = 1; j <= tracksNumber; j++){
            lyrics[j]=lyrics[j].toLowerCase();
        }
    }

    public void search(String str, String[] solution){
        boolean speaknowbool = false;
        for(int i = 1; i<=this.tracksNumber; i++){
            if(this.lyrics[i].contains(str)){
                if(speaknowbool){
                    solution[1]+= ", "+this.titles[i];
                    solution[0]+= ", "+i;
                }else{
                    speaknowbool= true;
                    solution[1]+= this.album+ ": "+this.titles[i];
                    solution[0]+= this.album+ ": "+ i;
                }
            }
        }
        solution[0]+="\n";
        solution[1]+="\n";
    }
}
