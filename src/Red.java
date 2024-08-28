public class Red {
    //begins in 1, index 0 unused
    String[] lyrics;
    String[] titles;
    String album;
    int tracksNumber;

    public Red() {
        tracksNumber = 28;
        lyrics = new String[tracksNumber + 1];
        album = "Red";
        titles = new String[]{"", "State of Grace", "Red", "Treacherous", "I Knew You Were Trouble", "All Too Well",
                "22", "I Almost Do", "We Are Never Ever Getting Back Together", "Stay Stay Stay", "The Last Time",
                "Holy Ground", "Sad Beautiful Tragic", "The Lucky One", "Everything Has Changed", "Starlight", "Begin Again",
                "The Moment I Knew", "Come Back...Be Here", "Girl At Home", "Ronan", "Better Man", "Nothing New",
                "Babe", "Message in a Bottle", "I Bet You Think About Me", "Forever Winter", "Run", "The Very First Night"
        };
        lyrics[1] = "I'm walkin' fast through the traffic lights Busy streets and busy lives And all we know is touch and go" +
                "We are alone with our changing minds We fall in love 'til it hurts or bleeds or fades in time" +
                "And I never (I never) Saw you comin' And I'll never (I'll never) Be the same You come around and the armor falls" +
                "Pierce the room like a cannonball Now all we know is don't let go We are alone, just you and me" +
                "Up in your room and our slates are clean Just twin fire signs, four blue eyes So you were never a saint and I loved in shades of wrong" +
                "We learn to live with the pain, mosaic broken hearts But this love is brave and wild And I never (I never)" +
                "Saw you comin' And I'll never (I'll never) Be the same This is a state of grace This is the worthwhile fight" +
                "Love is a ruthless game Unless you play it good and right These are the hands of fate You're my Achilles heel" +
                "This is the golden age of somethin' good And right and real And I never (I never) Saw you comin'" +
                "And I'll never Be the same, oh-oh-oh And I never (I never) Saw you comin' And I'll never (I'll never)" +
                "(So you were never a saint and I loved in shades of wrong) Be the same (We learn to live with the pain, mosaic broken hearts)" +
                "(But this love is brave and wild) This is a state of grace This is the worthwhile fight Love is a ruthless game" +
                "Unless you play it good and right ";
        lyrics[2] = "Loving him is like driving a new Maserati down a dead-end street Faster than the wind, passionate as sin, ending so suddenly" +
                "Loving him is like trying to change your mind once you're already flying through the free fall" +
                "Like the colors in autumn, so bright just before they lose it all Losing him was blue like I'd never known" +
                "Missing him was dark gray, all alone (Woah) Forgetting him was like tryin' to know somebody you never met" +
                "But loving him was red (Red, red) (Red, red) But loving him was red (Red, red) (Red, red) Touching him was like realizing all you ever wanted was right there in front of you" +
                "Memorizing him was as easy as knowing all the words to your old favorite song Fighting with him was like trying to solve a crossword and realizing there's no right answer" +
                "Regretting him was like wishing you never found out that love could be that strong Losing him was blue like I'd never known" +
                "Missing him was dark gray, all alone (Woah) Forgetting him was like tryin' to know somebody you never met" +
                "But loving him was red (Red, red) Oh, red (Red, red) Burning red (Red, red) (Red, red) Remembering him comes in flashbacks and echoes" +
                "Tell myself it's time now, gotta let go But moving on from him is impossible when I still see it all in my head" +
                "In burning red Burning, it was red Oh, losing him was blue like I'd never known Missing him was dark gray, all alone (Woah)" +
                "Forgetting him was like tryin' to know somebody you never met 'Cause loving him was red (Red, red)" +
                "Yeah, yeah, red (Red, red) Oh, burning red (Red, red) (Red, red) And that's why he's spinning 'round in my head (Red, red)" +
                "Comes back to me, burning red (Red, red) (Red, red) Yeah, yeah (Red, red) His love was like driving a new Maserati down a dead-end street";
        lyrics[3] = "Put your lips close to mine As long as they don't touch Out of focus, eye to eye 'Til the gravity's too much" +
                "And I'll do anything you say If you say it with your hands And I'd be smart to walk away But you're quicksand" +
                "This slope is treacherous This path is reckless This slope is treacherous And I-I-I like it I can't decide if it's a choice" +
                "Getting swept away I hear the sound of my own voice Asking you to stay All we are is skin and bone" +
                "Trained to get along Forever going with the flow But you're friction This slope is treacherous" +
                "This path is reckless This slope is treacherous I-I-I like it Two headlights shine through the sleepless night" +
                "And I will get you a— get you alone Your name has echoed through my mind And I just think you should— think you should know" +
                "That nothing safe is worth the drive And I would follow you, follow you home I'll follow you, follow you home" +
                "This hope is treacherous This daydream is dangerous This hope is treacherous I-I-I, I-I-I, I-I-I—" +
                "Two headlights shine through the sleepless night And I will get you a— get you alone Your name has echoed through my mind" +
                "And I just think you should— think you should know That nothing safe is worth the drive And I will follow you, follow you home" +
                "I'll follow you, follow you home I'll follow you, follow you home I'll follow you, follow you home" +
                "This slope is treacherous I-I-I like it ";
        lyrics[4] = "Once upon a time, a few mistakes ago I was in your sights, you got me alone You found me, you found me, you found me-e-e-e-e" +
                "I guess you didn't care and I guess I liked that And when I fell hard, you took a step back" +
                "Without me, without me, without me-e-e-e-e-e And he's long gone when he's next to me And I realize the blame is on me" +
                "'Cause I knew you werе trouble when you walked in So shamе on me now Flew me to places I'd never been" +
                "'Til you put me down, oh I knew you were trouble when you walked in So shame on me now Flew me to places I'd never been" +
                "Now I'm lyin' on the cold hard ground Oh, oh Trouble, trouble, trouble Oh, oh Trouble, trouble, trouble" +
                "No apologies, he'll never see you cry Pretends he doesn't know that he's the reason why You're drowning, you're drowning, you're drowning-ing-ing-ing-ing" +
                "And I heard you moved on from whispers on the street A new notch in your belt is all I'll ever be" +
                "And now I see, now I see, now I see-e-e-e-e-e He was long gone when he met me And I realize the joke is on me, hey" +
                "I knew you were trouble when you walked in (Oh) So shame on me now Flew me to places I'd never been" +
                "'Til you put me down, oh I knew you were trouble when you walked in So shame on me now Flew me to places I'd never been (Yeah)" +
                "Now I'm lyin' on the cold hard ground Oh, oh (Yeah) Trouble, trouble, trouble (Trouble) Oh, oh" +
                "Trouble, trouble, trouble And the saddest fear Comes creepin' in That you never loved me Or her or anyone or anything, yeah" +
                "I knew you were trouble when you walked in So shame on me now Flew me to places I'd never been (Never been)" +
                "'Til you put me down, oh I knew you were trouble when you walked in (I knew it right there)" +
                "So shame on me now (I knew it right there) Flew me to places I'd never been (Woah) Now I'm lyin' on the cold hard ground" +
                "Oh, oh Trouble, trouble, trouble (Oh) Oh, oh Trouble, trouble, trouble (Trouble) 'Cause I knew you were trouble when you walked in" +
                "Trouble, trouble, trouble 'Cause I knew you were trouble when you walked in Trouble, trouble, trouble";
        lyrics[5] = "I walked through the door with you, the air was cold But somethin' 'bout it felt like home somehow" +
                "And I left my scarf there at your sister's house And you've still got it in your drawer, even now" +
                "Oh, your sweet disposition and my wide-eyed gaze We're singin' in the car, getting lost upstate" +
                "Autumn leaves fallin' down like pieces into place And I can picture it after all these days" +
                "And I know it's long gone and That magic's not here no more And I might be okay, but I'm not fine at all" +
                "Oh, oh, oh 'Causе there we arе again on that little town street You almost ran the red 'cause you were lookin' over at me" +
                "Wind in my hair, I was there I remember it all too well Photo album on the counter, your cheeks were turnin' red" +
                "You used to be a little kid with glasses in a twin-sized bed And your mother's tellin' stories 'bout you on the tee-ball team" +
                "You taught me 'bout your past, thinkin' your future was me And you were tossing me the car keys, \"Fuck the patriarchy\"" +
                "Keychain on the ground, we were always skippin' town And I was thinkin' on the drive down, \"Any time now" +
                "He's gonna say it's love,\" you never called it what it was 'Til we were dead and gone and buried" +
                "Check the pulse and come back swearin' it's the same After three months in the grave And then you wondered where it went to as I reached for you" +
                "But all I felt was shame and you held my lifeless frame And I know it's long gone and There was nothing else I could do" +
                "And I forget about you long enough To forget why I needed to 'Cause there we are again in the middle of the night" +
                "We're dancin' 'round the kitchen in the refrigerator light Down the stairs, I was there I remember it all too well" +
                "And there we are again when nobody had to know You kept me like a secret, but I kept you like an oath" +
                "Sacred prayer and we'd swear To remember it all too well, yeah Well, maybe we got lost in translation, maybe I asked for too much" +
                "But maybe this thing was a masterpiece 'til you tore it all up Runnin' scared, I was there I remember it all too well" +
                "And you call me up again just to break me like a promise So casually cruel in the name of bein' honest" +
                "I'm a crumpled-up piece of paper lyin' here 'Cause I remember it all, all, all They say all's well that ends well, but I'm in a new hell" +
                "Every time you double-cross my mind You said if we had been closer in age, maybe it would've been fine" +
                "And that made me want to die The idea you had of me, who was she? A never-needy, ever-lovely jewel whose shine reflects on you" +
                "Not weepin' in a party bathroom Some actress askin' me what happened, you That's what happened, you" +
                "You who charmed my dad with self-effacing jokes Sippin' coffee like you're on a late-night show" +
                "But then he watched me watch the front door all night, willin' you to come And he said, \"It's supposed to be fun turning twenty-one\"" +
                "Time won't fly, it's like I'm paralyzed by it I'd like to be my old self again, but I'm still tryin' to find it" +
                "After plaid shirt days and nights when you made me your own Now you mail back my things and I walk home alone" +
                "But you keep my old scarf from that very first week 'Cause it reminds you of innocence and it smells like me" +
                "You can't get rid of it 'Cause you remember it all too well, yeah 'Cause there we are again when I loved you so" +
                "Back before you lost the one real thing you've ever known It was rare, I was there I remember it all too well" +
                "Wind in my hair, you were there You remember it all Down the stairs, you were there You remember it all" +
                "It was rare, I was there I remember it all too well And I was never good at tellin' jokes, but the punch line goes" +
                "\"I'll get older, but your lovers stay my age\" From when your Brooklyn broke my skin and bones" +
                "I'm a soldier who's returning half her weight And did the twin flame bruise paint you blue?" +
                "Just between us, did the love affair maim you too? 'Cause in this city's barren cold I still remember the first fall of snow" +
                "And how it glistened as it fell I remember it all too well Just between us, did the love affair maim you all too well?" +
                "Just between us, do you remember it all too well? Just between us, I remember it (Just between us) all too well" +
                "Wind in my hair, I was there, I was there (I was there) Down the stairs, I was there, I was there" +
                "Sacred prayer, I was there, I was there It was rare, you remember it all too well Wind in my hair, I was there, I was there (Oh)" +
                "Down the stairs, I was there, I was there (I was there) Sacred prayer, I was there, I was there" +
                "It was rare, you remember it (All too well) Wind in my hair, I was there, I was there Down the stairs, I was there, I was there" +
                "Sacred prayer, I was there, I was there It was rare, you remember it Wind in my hair, I was there, I was there" +
                "Down the stairs, I was there, I was there Sacred prayer, I was there, I was there It was rare, you remember it";
        lyrics[6] = "It feels like a perfect night To dress up like hipsters And make fun of our exes Uh-uh, uh-uh" +
                "It feels like a perfect night For breakfast at midnight To fall in love with strangers Uh-uh, uh-uh" +
                "Yeah We're happy, free, confused, and lonely at the same time It's miserable and magical, oh yeah" +
                "Tonight's the night when we forget about the deadlines It's time, oh-oh I don't know about you" +
                "But I'm feelin' twenty-two Everything will be alright if You keep me next to you You don't know about me" +
                "But I'll bet you want to Everything will bе alright if We just keep dancin' like we'rе Twenty-two" +
                "Twenty-two It seems like one of those nights This place is too crowded Too many cool kids Uh-uh, uh-uh (Who's Taylor Swift anyway? Ew)" +
                "It seems like one of those nights We ditch the whole scene And end up dreamin' Instead of sleepin'" +
                "Yeah We're happy, free, confused, and lonely in the best way It's miserable and magical, oh, yeah" +
                "Tonight's the night when we forget about the heartbreaks It's time, oh-oh (Hey) I don't know about you" +
                "But I'm feelin' twenty-two Everything will be alright if (Ooh) You keep me next to you You don't know about me" +
                "But I'll bet you want to Everything will be alright if (Alright) We just keep dancin' like we're" +
                "Twenty-two (Oh, oh, oh, oh, oh) Twenty-two (I don't know about you) Twenty-two Twenty-two (Ooh)" +
                "It feels like one of those nights We ditch the whole scene It feels like one of those nights" +
                "We won't be sleepin' It feels like one of those nights You look like bad news I gotta have you" +
                "I gotta have you Ooh, oh Yeah, hey, yeah (Hey) I don't know about you (I don't know about you)" +
                "But I'm feelin' twenty-two Everything will be alright if (Ooh, oh-oh) You keep me next to you" +
                "You don't know about me (You don't know about me) But I'll bet you want to Everything will be alright if" +
                "We just keep dancin' like we're (Dance like we're twenty-two) Twenty-two (Ooh, woah-oh-oh-oh)" +
                "Twenty-two (Dancin' like) Twenty-two (Yeah, yeah) Twenty-two (Yeah, yeah, yeah) It feels like one of those nights (Twenty-two)" +
                "We ditch the whole scene It feels like one of those nights (Twenty-two) We won't be sleepin'" +
                "It feels like one of those nights (Twenty-two) You look like bad news I gotta have you I gotta have you";
        lyrics[7] = "I bet, this time of night, you're still up I bet you're tired from a long, hard week I bet you're sittin' in your chair by the window lookin' out at the city" +
                "And I bet sometimes you wonder 'bout me And I just wanna tell you It takes everything in me not to call you" +
                "And I wish I could run to you And I hope you know that Every time I don't, I almost do I almost do" +
                "I bet you think I either moved on or hate you 'Cause each time you reach out, there's no reply" +
                "I bet it never, ever occurred to you That I can't say hello to you and risk another goodbye" +
                "And I just wanna tell you It takes everything in me not to call you And I wish I could run to you" +
                "And I hope you know that Every time I don't, I almost do I almost do (Ooh) Oh, we made quite a mess, babe" +
                "It's probably better off this way And I confess, babe In my dreams, you're touchin' my face And asking me if I'd wanna try again with you" +
                "And I almost do And I just wanna tell you It takes everything in me not to call you And I wish I could run to you" +
                "And I hope you know that Every time I don't, I almost do I almost do (Ooh) I bet, this time of night, you’re still up" +
                "I bet you're tired from a long, hard week I bet you're sittin' in your chair by the window lookin' out at the city" +
                "And I hope sometimes you wonder 'bout me ";
        lyrics[8] = "I remember when we broke up the first time Sayin', \"This is it, I've had enough\" 'Cause, like, we hadn't seen each other in a month" +
                "When you said you needed space, what? Then you come around again and say \"Baby, I miss you and I swear I'm gonna change, trust me\"" +
                "Remember how that lasted for a day? I say, \"I hate you,\" we break up, you call me, \"I love you\"" +
                "Ooh, we called it off again last night, but Ooh, this time, I'm tellin' you, I'm tellin' you" +
                "We are never, evеr, ever gettin' back togеther We are never, ever, ever gettin' back together" +
                "You go talk to your friends, talk to my friends, talk to me But we are never, ever, ever, ever gettin' back together" +
                "Like, ever I'm really gonna miss you pickin' fights And me fallin' for it, screaming that I'm right" +
                "And you would hide away and find your peace of mind With some indie record that's much cooler than mine (Haha)" +
                "Ooh, you called me up again tonight, but Ooh, this time, I'm tellin' you, I'm tellin' you (Oh)" +
                "We (We) are never, ever, ever gettin' back together We are never, ever, ever (Ever) gettin' back together" +
                "You go talk to your friends, talk to my friends, talk to me (Talk to me) But we are never, ever, ever, ever gettin' back together" +
                "Ooh (Yeah), ooh (Yeah) Ooh (Yeah), oh I used to think that we were forever, ever And I used to say, \"Never say never\"" +
                "Ugh, so he calls me up and he's, like, \"I still love you\" And I'm, like, I'm just, I mean, this is exhausting, you know?" +
                "Like, we are never getting back together Like, ever (No) We are never, ever, ever gettin' back together" +
                "We are never, ever, ever (Oh) gettin' back together You go talk to your friends, talk to my friends, talk to me (To me)" +
                "But we are never, ever, ever, ever gettin' back together We (Ooh), no Gettin' back together (Ooh)" +
                "We (Ooh), oh Gettin' back together (Ooh), yeah You go talk to your friends, talk to my friends, talk to me (Talk to me)" +
                "But we are never, ever, ever, ever gettin' back together ";
        lyrics[9] = "I'm pretty sure we almost broke up last night I threw my phone across the room at you I was expecting some dramatic turn away" +
                "But you stayed This morning, I said we should talk about it 'Cause I read you should never leave a fight unresolved" +
                "That's when you came in wearing a football helmet And said, \"Okay, let's talk\" And I said, \"Stay, stay, stay\"" +
                "I've been loving you for quite some time, time, time You think that it's funny when I'm mad, mad, mad" +
                "But I think that it's best if we both stay Before you, I'd only dated self-indulgent takers" +
                "Who took all of their problems out on me But you carry my groceries and now I'm always laughing" +
                "And I love you because you have given me No choice but to stay, stay, stay I've been loving you for quite some time, time, time" +
                "You think that it's funny when I'm mad, mad, mad But I think that it's best if we both stay, stay, stay, stay" +
                "You took the time to memorize me My fears, my hopes and dreams I just like hanging out with you" +
                "All the time All those times that you didn't leave It's been occurring to me I'd like to hang out with you" +
                "For my whole life Stay And I'll be loving you for quite some time No one else is gonna love me when I get mad, mad, mad" +
                "So I think that it's best if we both stay, stay, stay, stay, stay, stay Stay, stay, stay I've been loving you for quite some time, time, time" +
                "You think that it's funny when I'm mad, mad, mad But I think that it's best if we both stay, stay, stay, stay, stay, stay" +
                "Stay, stay, stay I've been loving you for quite some time, time, time You think that it's funny when I'm mad, mad, mad" +
                "But I think that it's best if we both stay That's so fun ";
        lyrics[10] = "I find myself at your door Just like all those times before I’m not sure how I got there All roads, they lead me here" +
                "I imagine you are home In your room, all alone And you open your eyes into mine And everything feels better" +
                "And right before your eyes I'm breakin' No past, no reasons why Just you and me This is the last time I'm askin' you this" +
                "Put my name at the top of your list This is the last time I'm askin' you why You break my heart in the blink of an eye, eye, eye" +
                "You find yourself at my door And just like all those times before You wear your best apology" +
                "But I was there to watch you leave And all the times I let you in Just for you to go again Disappear when you come back" +
                "Everything is better And right before your eyes I'm achin' No past, nowhere to hide Just you and me" +
                "This is the last time I'm askin' you this Put my name at the top of your list This is the last time I'm askin' you why" +
                "You break my heart in the blink of an eye, eye, eye This is the last time you tell me I've got it wrong" +
                "This is the last time I say, \"It's been you all along\" This is the last time I let you in my door" +
                "This is the last time, I won't hurt you anymore Oh, oh, oh, oh Oh, oh, oh, oh This is the last time I'm askin' you this" +
                "Put my name at the top of your list This is the last time I'm askin' you why You break my heart in the blink of an eye" +
                "This is the last time I'm askin' you this (This is the last time I'm askin' you this) Put my name at the top of your list (Put my name at the top of your list)" +
                "This is the last time I'm askin' you why (This is the last time I'm askin' you why) You break my heart in the blink of an eye (You break my heart)" +
                "This is the last time I'm askin' you, last time I'm askin' you Last time I'm askin' you this" +
                "This is the last time I'm askin' you, last time I'm askin' you Last time I'm askin' you this" +
                "This is the last time I'm askin' you, last time I'm askin' you Last time I'm askin' you this" +
                "This is the last time I'm askin' you, last time I'm askin' you Last time I'm askin' you this";
        lyrics[11] = "I was reminiscing just the other day While havin' coffee all alone and, Lord, it took me away" +
                "Back to a first-glance feelin' on New York time Back when you fit my poems like a perfect rhyme" +
                "Took off faster than a green light, go Yeah, you skip the conversation when you already know" +
                "I left a note on the door with a joke we'd made And that was the first day And darlin', it was good" +
                "Never lookin' down And right there where we stood Was holy ground Spinnin' like a girl in a brand new dress" +
                "We had this big, wide city all to ourselves Wе block the noise with the sound of, \"I need you\"" +
                "And for thе first time, I had something to lose And I guess we fell apart in the usual way And the story's got dust on every page" +
                "But, sometimes, I wonder how you think about it now And I see your face in every crowd 'Cause, darlin', it was good (Ooh-ayy, ooh-ayy)" +
                "Never lookin' down (Ooh-ayy, ooh-ayy) And right there where we stood (Ooh-ayy) Was holy ground" +
                "Ooh-ayy, ooh-ayy, ooh-ayy, oh-woah Ooh-ayy, ooh-ayy, ooh-ayy, oh-woah Tonight, I'm gonna dance" +
                "For all that we've been through But I don't wanna dance If I'm not dancin' with you Tonight, I'm gonna dance" +
                "Like you were in this room But I don't wanna dance If I'm not dancin' with you It was good I'm never lookin' down" +
                "And right there where we stood Was holy ground Ooh-ayy, ooh-ayy, ooh-ayy, oh-woah Ooh-ayy, ooh-ayy, ooh-ayy, oh-woah" +
                "Tonight, I'm gonna dance (Ooh-ayy, ooh-ayy) For all that we've been through (Ooh-ayy, oh-woah)" +
                "But I don't wanna dance (Ooh-ayy, ooh-ayy) If I'm not dancin' with you (Ooh-ayy, oh-woah) Tonight, I'm gonna dance (Ooh-ayy, ooh-ayy)" +
                "Like you were in this room (Ooh-ayy, oh-woah) But I don't wanna dance (Ooh-ayy, ooh-ayy) If I'm not dancin' with you";
        lyrics[12] = "Long handwritten notes deep in your pocket Words, how little they mean when you're a little too late" +
                "I stood right by the tracks, your face in a locket Good girls, hopeful they'll be and long they will wait" +
                "We had a beautiful, magic love there What a sad, beautiful, tragic love affair In dreams, I meet you in warm conversation" +
                "And we both wake in lonely beds and different cities And time is taking its sweet time erasing you" +
                "And you've got your demons and, darlin', they all look like me 'Cause wе had a beautiful, magic love therе" +
                "What a sad, beautiful, tragic love affair Woah, woah, woah, oh Distance, timin', breakdown, fighting" +
                "Silence, the train runs off its tracks Kiss me, try to fix it, could you just try to listen?" +
                "Hang up, give up and, for the life of us, we can't get back A beautiful, magic love there What a sad, beautiful, tragic, beautiful, tragic, beautiful" +
                "What we had, a beautiful, magic love there What a sad, beautiful, tragic love affair We had a beautiful, magic love there" +
                "What a sad, beautiful, tragic love affair ";
        lyrics[13] = "New to town with a made-up name In the angel's city, chasin' fortune and fame And the camera flashes make it look like a dream" +
                "You had it figured out since you were in school Everybody loves pretty, everybody loves cool" +
                "So overnight, you look like a '60s queen Another name goes up in lights Like diamonds in the sky" +
                "And they'll tell you now, you're the lucky one Yeah, they'll tell you now, you're the lucky one" +
                "But can you tell me now, you're the lucky one? Oh, oh, oh And now, it's big black cars and Riviera views" +
                "And your lover in the foyer doesn't even know you And your secrets end up splashed on the news front page" +
                "And they tell you that you're lucky, but you're so confused 'Cause you don't feel pretty, you just feel used" +
                "And all the young things line up to take your place Another name goes up in lights You wonder if you'll make it out alive" +
                "And they'll tell you now, you're the lucky one Yeah, they'll tell you now, you're the lucky one" +
                "Can you tell me now, you're the lucky one? Oh, oh, oh Oh, oh, oh It was a few years later, I showed up here" +
                "And they still tell the legend of how you disappeared How you took the money and your dignity and got the hell out" +
                "They say you bought a bunch of land somewhere Chose the rose garden over Madison Square And it took some time, but I understand it now" +
                "'Cause now my name is up in lights But I think you got it right Let me tell you now, you're the lucky one" +
                "Let me tell you now, you're the lucky one Let me tell you now, you're the lucky one Oh, oh, oh" +
                "Yeah, they'll tell you now, you're the lucky one Yeah, they'll tell you now, you're the lucky one" +
                "Let me tell you now, you're the lucky one Oh, oh, oh Oh, oh-woah, oh ";
        lyrics[14] = "You good to go? All I knew this mornin' when I woke Is I know something now Know something now I didn't before" +
                "And all I've seen since eighteen hours ago Is green eyes and freckles and your smile In the back of my mind makin' me feel like" +
                "I just wanna know you better Know you better, know you better now I just wanna know you better" +
                "Know you better, know you better now I just wanna know you better Know you better, know you better now" +
                "I just wanna know you Know you, know you 'Cause all I know is we said, \"Hello\" And your eyes look like comin' homе" +
                "All I know is a simple name Everything has changеd All I know is you held the door You'll be mine and I'll be yours" +
                "All I know since yesterday, yeah Is everything has changed And all my walls stood tall, painted blue" +
                "But I'll take 'em down, take 'em down And open up the door for you And all I feel in my stomach is butterflies" +
                "The beautiful kind, makin' up for lost time Takin' flight, makin' me feel like I just wanna know you better" +
                "Know you better, know you better now I just wanna know you better Know you better, know you better now" +
                "I just wanna know you better Know you better, know you better now I just wanna know you Know you, know you" +
                "'Cause all I know is we said, \"Hello\" And your eyes look like comin' home All I know is a simple name" +
                "Everything has changed All I know is you held the door You'll be mine and I'll be yours All I know since yesterday, yeah" +
                "Is everything has changed Come back and tell me why I'm feelin' like I've missed you all this time (Oh-oh-oh)" +
                "And meet me there tonight And let me know that it's not all in my mind-ind-ind I just wanna know you better" +
                "Know you better, know you better now I just wanna know you Know you, know you All I know is we said, \"Hello\"" +
                "And your eyes look like comin' home All I know is a simple name Everything has changed All I know is you held the door" +
                "And you'll be mine and I'll be yours All I know since yesterday, yeah Is everything has changed" +
                "All I know is we said, \"Hello\" So dust off your highest hopes All I know is pourin' rain And everything has changed" +
                "All I know is a new found grace All my days, I'll know your face All I know since yesterday, yeah" +
                "Is everything has changed ";
        lyrics[15] = "I said, \"Oh my, what a marvelous tune\" It was the best night, never would forget how he moved" +
                "The whole place was dressed to the nines And we were dancin', dancin' Like we're made of starlight" +
                "Like we're made of starlight I met Bobby on the boardwalk, summer of '45 Picks me up late one night, out the window" +
                "We were seventeen and crazy, runnin' wild, wild Can't remember what song it was playin' whеn we walked in" +
                "The night wе snuck into a yacht club party Pretendin' to be a duchess and a prince And I said, \"Oh my, what a marvelous tune\"" +
                "It was the best night, never would forget how he moved The whole place was dressed to the nines" +
                "And we were dancin', dancin' Like we're made of starlight, starlight Like we're made of starlight, starlight" +
                "He said, \"Look at you, worrying too much about things you can't change\" \"You'll spend your whole life singing the blues if you keep thinkin' that way\"" +
                "He was tryin' to skip rocks on the ocean, saying to me \"Don't you see the starlight, starlight?\"" +
                "\"Don't you dream impossible things?\" Like, \"Oh my, what a marvelous tune\" It was the best night, never would forget how he moved" +
                "The whole place was dressed to the nines And we were dancin', dancin' Like we're made of starlight, starlight" +
                "Like we're made of starlight, starlight Ooh, ooh, he's talkin' crazy Ooh, ooh, dancin' with me" +
                "Ooh, ooh, we could get married Have ten kids and teach 'em how to dream (Ooh-hoo-hoo) (Ooh-hoo-hoo)" +
                "(Ooh-hoo-hoo) (Ooh-hoo-hoo) Oh my, what a marvelous tune It was the best night, never would forget how he moved" +
                "The whole place was dressed to the nines And we were dancin', dancin' Like we're made of starlight, starlight" +
                "Like we're made of starlight, starlight Like we're made of starlight, starlight Like we dream impossible dreams" +
                "Like starlight, starlight Like we dream impossible dreams Don't you see the starlight, starlight?" +
                "Don't you dream impossible things? ";
        lyrics[16] = "Took a deep breath in the mirror He didn't like it when I wore high heels, but I do Turn the lock and put my headphones on" +
                "He always said he didn't get this song, but I do, I do I walked in, expectin' you'd be late" +
                "But you got here early and you stand and wave, I walk to you You pull my chair out and help me in" +
                "And you don't know how nice that is, but I do And you throw your head back laughin' like a little kid" +
                "I think it's strange that you think I'm funny 'cause he never did I've been spendin' the last eight months" +
                "Thinkin' all love ever does is break and burn and end But on a Wеdnesday in a café, I watched it begin again" +
                "You said you nеver met one girl who Had as many James Taylor records as you, but I do We tell stories and you don't know why" +
                "I'm comin' off a little shy, but I do But you throw your head back laughin' like a little kid" +
                "I think it's strange that you think I'm funny 'cause he never did I've been spendin' the last eight months" +
                "Thinkin' all love ever does is break and burn and end But on a Wednesday in a café, I watched it begin again" +
                "And we walked down the block to my car And I almost brought him up But you start to talk about the movies" +
                "That your family watches every single Christmas And I wanna talk about that And for the first time, what's past is past" +
                "'Cause you throw your head back laughin' like a little kid I think it's strange that you think I'm funny 'cause he never did" +
                "I've been spendin' the last eight months Thinkin' all love ever does is break and burn and end" +
                "But on a Wednesday in a café, I watched it begin again On a Wednesday in a café, I watched it begin again";
        lyrics[17] = "You should've been there Should've burst through the door With that \"Baby, I'm right here\" smile" +
                "And it would've felt like A million little shining stars that just align And I would've been so happy" +
                "Christmas lights glisten I've got my eye on the door Just waitin' for you to walk in But the time is tickin'" +
                "People ask me how I've been As I comb back through my memory How you said you'd be here You said you'd be here" +
                "And it was like slow motion Standing there in my party dress In red lipstick With no one to impress" +
                "And they're all laughin' As I'm lookin' around the room But therе was one thing missin' And that was the moment I knеw" +
                "And the hours pass by Now I just wanna be alone But your close friends always seem to know When there's somethin' really wrong" +
                "So they follow me down the hall And there in the bathroom I try not to fall apart And the sinking feelin' starts" +
                "As I say hopelessly \"He said he'd be here\" And it was like slow motion Standing there in my party dress" +
                "In red lipstick With no one to impress And they're all laughin' And asking me about you But there was one thing missin'" +
                "And that was the moment I knew What do you say When tears are streaming down your face In front of everyone you know?" +
                "And what do you do When the one who means the most to you Is the one who didn't show? You should've been here" +
                "And I would've been so happy And it was like slow motion Standing there in my party dress In red lipstick" +
                "With no one to impress And they're all standin' around me, singin' \"Happy birthday to you\" But there was one thing missin'" +
                "And that was the moment I knew (Oh) Oh, I knew (Oh) You called me later And said, \"I'm sorry I didn't make it\"" +
                "And I said, \"I'm sorry too\" And that was the moment I knew ";
        lyrics[18] = "You said it in a simple way 4 AM, the second day How strange that I don't know you at all Stumbled through the long goodbye" +
                "One last kiss, then catch your flight Right when I was just about to fall I told myself, \"Don't get attached\"" +
                "But in my mind, I play it back Spinning faster than the plane that took you And this is when the feelin' sinks in" +
                "I don't wanna miss you like this Come back, be here Come back, be here I guess you're in New York today" +
                "I don't wanna need you this way Come back, be here Come back, be here The delicate beginnin' rush" +
                "The feelin' you can know so much Without knowing anything at all And now that I can put this down" +
                "If I had known what I know now I never would've played so nonchalant Taxi cabs and busy streets" +
                "That never bring you back to me I can't help but wish you took me with you And this is when the feelin' sinks in" +
                "I don't wanna miss you like this Come back, be here Come back, be here I guess you're in London today" +
                "And I don't wanna need you this way Come back, be here Come back, be here Oh, oh Oh, oh Oh, oh This is falling in love in the cruelest way" +
                "This is fallin' for you when you are worlds away In New York, be here But you're in London and I break down" +
                "'Cause it's not fair that you're not around This is when the feelin' sinks in I don't wanna miss you like this" +
                "Come back, be here Come back, be here I guess you're in New York today And I don't wanna need you this way" +
                "Come back, be here Come back, be here Oh, oh I don't wanna miss you like this Oh, oh Come back, be here" +
                "Come back, be here ";
        lyrics[19] = "Don't look at me, you got a girl at home And everybody knows that, everybody knows that, ah-ah" +
                "Don’t look at me, you got a girl at home And everybody knows that I don't even know her But I feel a responsibility" +
                "To do what's upstanding and right It’s kinda like a code, yeah And you've been getting closer and closer" +
                "And crossing so many lines And it would be a fine proposition If I was a stupid girl But, honey, I am no one's exception" +
                "This, I have previously learned So don't look at me, you got a girl at home And everybody knows that, everybody knows that, ah-ah" +
                "Don't look at me, you got a girl at home And everybody knows that, еverybody knows that I see you turn off your phone" +
                "And now you've got mе alone, and I say Don't look at me, you got a girl at home And everybody knows that, everybody knows that" +
                "I just wanna make sure You understand perfectly You're the kind of man who makes me sad While she waits up" +
                "You chase down the newest thing And take for granted what you have And it would be a fine proposition" +
                "If I was a stupid girl And, yeah, I might go with it If I hadn’t once been just like her So don’t look at me, you got a girl at home" +
                "And everybody knows that, everybody knows that, ah-ah Don't look at me, you got a girl at home" +
                "And everybody knows that, everybody knows that I see you turn off your phone And now you’ve got me alone, and I say" +
                "Don't look at me, you got a girl at home And everybody knows that, everybody knows that Oh-oh" +
                "Oh-oh Call a cab, lose my number You're about to lose your girl Call a cab, lose my number Let's consider this lesson learned" +
                "Don’t look at me, you got a girl at home And everybody knows that, everybody knows that, ah-ah" +
                "Don't look at me, you got a girl at home And everybody knows that, everybody knows that Wanna see you pick up your phone" +
                "And tell her you're coming home Don't look at me, you got a girl at home And everybody knows that, everybody knows that" +
                "It would be a fine proposition If I hadn't once been just like her ";
        lyrics[20] = "I remember your bare feet down the hallway I remember your little laugh Race cars on the kitchen floor, plastic dinosaurs" +
                "I love you to the Moon and back I remember your blue eyes lookin' into mine Like we had our own secret club" +
                "I remember you dancin' before bedtime Then jumpin' on me, waking me up I can still feel you hold my hand, little man" +
                "And even the moment I knew You fought it hard like an army guy Remember I leaned in and whispered to you" +
                "\"Come on, baby, with me We're gonna fly away from here You were my best four years\" I remember the drive home when the blind hope" +
                "Turned to cryin' and screamin', \"Why?\" Flowers pile up in the worst way, no one knows what to say" +
                "About a beautiful boy who died And it's about to be Halloween, you could be anything You wanted if you were still here" +
                "I remember the last day when I kissed your face And whispered in your ear \"Come on, baby, with me" +
                "We're gonna fly away from here Out of this curtained room and this hospital gray We'll just disappear" +
                "Come on, baby, with me We're gonna fly away from here You were my best four years\" What if I'm standin' in your closet trying to talk to you?" +
                "And what if I kept the hand-me-downs you won't grow into? And what if I really thought some miracle would see us through?" +
                "And what if the miracle was even gettin' one moment with you? Come on, baby, with me We're gonna fly away from here" +
                "Come on, baby, with me We're gonna fly away from here You were my best four years I remember your bare feet down the hallway" +
                "I love you to the Moon and back ";
        lyrics[21] = "I know I'm probably better off on my own Than lovin’ a man who didn't know what he had when he had it" +
                "And I see the permanent damage you did to me Never again, I just wish I could forget when it was magic" +
                "I wish it wasn't 4AM, standin’ in the mirror Saying to myself, \"You know you had to do it\" I know the bravest thing I ever did was run" +
                "Sometimes, in the middle of the night, I can feel you again But I just miss you and I just wish you were a better man" +
                "I know why we had to say goodbye like the back of my hand But I just miss you and I just wish you were a better man" +
                "A better man I know I'm probably better off all alone Than needing a man who could change his mind at any given minute" +
                "And it was always on your terms, I waited on every careless word Hoping they might turn sweet again like it was in the beginning" +
                "But your jealousy, oh, I can hear it now Talking down to me like I'd always be around Push my love away like it was some kind of loaded gun" +
                "Oh, you never thought I'd run Sometimes, in the middle of the night, I can feel you again But I just miss you and I just wish you were a better man" +
                "I know why we had to say goodbye like the back of my hand But I just miss you and I just wish you were a better man" +
                "A better man I hold onto this pride because, these days, it's all I have And I gave to you my best" +
                "And we both know you can't say that I wish you were a better man I wonder what we would've become if you were a better man" +
                "We might still be in love if you were a better man You would've been the one if you were a better man" +
                "Sometimes, in the middle of the night, I can feel you again But I just miss you and I just wish you were a better man" +
                "I know why we had to say goodbye like the back of my hand But I just miss you and I just wish you were a better man" +
                "A better man (Sometimes, in the middle of the night, I can feel you again) We might still be in love, if you were a better man" +
                "(But I just miss you and I just wish you were a better man) I know why we had to say goodbye like the back of my hand" +
                "But I just miss you and I just wish you were a better man A better man We might still be in love if you were a better man" +
                "You would’ve been the one if you were a better man ";
        lyrics[22] = "They tell you while you're young \"Girls, go out and have your fun\" Then they hunt and slay the ones who actually do it" +
                "Criticize the way you fly When you're soaring through the sky Shoot you down and then they sigh" +
                "And say, \"She looks like she's been through it\" Lord, what will become of me Once I've lost my novelty?" +
                "I've had too much to drink tonight And I know it's sad, but this is what I think about And I wake up in the middle of the night" +
                "It's like I can feel time moving How can a person know everythin' at eighteen But nothin' at twenty-two?" +
                "And will you still want me When I'm nothing new? How long will it be cute, all this cryin' in my room?" +
                "When you can't blame it on my youth And roll your eyes with affection And my cheeks are growing tired" +
                "From turning red and faking smiles Are we only biding time 'til I lose your attention? And someone else lights up the room (Ah)" +
                "People love an ingénue (Ah) I've had (I've had) too much to drink tonight How did I go from growin' up to breaking down?" +
                "And I wake up (Wake up) in the middle of the night It's like I can feel time movin' How can a person know everything at eighteen" +
                "But nothing at twenty-two? And will you still want me When I'm nothing new? I know someday I'm gonna meet her, it's a fever dream" +
                "The kind of radiance you only have at seventeen She'll know the way and then she'll say she got the map from me" +
                "I'll say I'm happy for her, then I'll cry myself to sleep Oh, woah, oh (Oh) Oh, woah, oh, woah, oh (Oh)" +
                "I've had (I've had) too much to drink tonight But I wonder if they'll miss me once they drive me out" +
                "I wake up (Wake up) in the middle of the night And I can feel time moving How can a person know everything at eighteen" +
                "But nothing at twenty-two? And will you still want me Will you still want me Will you still want me" +
                "When I'm nothing new? ";
        lyrics[23] = "What about your promises, promises? What about your promises, promises, promises? No What a shame" +
                "Didn't wanna be the one that got away, yeah Big mistake, you broke the sweetest promise That you never should have made" +
                "I'm here on the kitchen floor You call, but I won't hear it You said, \"No one else\" How could you do this, babe?" +
                "(What about your promises, promises?) You really blew this, babe We ain't getting through this one, babe" +
                "This is the last time I'll ever call you, babe (This is the last time, this is the last time)" +
                "This is the last time I'll ever call you, babe (What about your promises, promises, promises? No)" +
                "What a waste Takin' down the pictures and the plans we made, yeah And it's strange how your face doesn't look so innocent" +
                "Your secret has its consequence and that's on you, babe I break down every time you call We're a wreck, you're the wrecking ball" +
                "We said, \"No one else\" How could you do this, babe? (Oh, what about your promises, promises?)" +
                "You really blew this, babe We ain't getting through this one, babe This is the last time I'll ever call you, babe" +
                "(This is the last time, this is the last time) This is the last time I'll ever call you Since you admitted it (Oh-oh), I keep picturin' (Oh-oh)" +
                "Her lips on your neck (Oh-oh), I can't unsee it I hate that because of you, I can't love you, babe" +
                "What a shame, didn't want to be the one that got away How could you do this, babe? (Babe) You really blew this, babe (Babe)" +
                "We ain't getting through this one, babe (Babe) This is the last time I'll ever call you, babe (Babe)" +
                "(This is the last time, this is the last time) This is the last time I'll ever call you I'm here on the kitchen floor" +
                "You call, but I won't hear it You said, \"No one else\" We ain't getting through this one, babe" +
                "I break down every time you call We're a wreck, you're the wrecking ball We said, \"No one else\"" +
                "This is the last time I'll ever call you, babe (Babe) (What about your promises, promises?)";
        lyrics[24] = "I know that you like me And it's kinda frightenin' standin' here waitin', waitin' And I became hypnotized" +
                "By freckles and bright eyes, tongue-tied But now, you're so far away and I'm down Feelin' like a face in the crowd" +
                "I'm reachin' for you, terrified 'Cause you could be the one that I love I could be the one that you dream of" +
                "A message in a bottle is all I can do Standin' here, hopin' it gets to you You could be the one that I keep, and I" +
                "I could be the reason you can't sleep at night A mеssage in a bottle is all I can do Standin' herе, hopin' it gets to you" +
                "These days I'm restless Workdays are endless, look how you made me, made me But time moves faster" +
                "Replayin' your laughter, disaster 'Cause now, you're so far away and I'm down Feelin' like a face in the crowd" +
                "I'm reachin' for you, terrified, 'cause 'Cause you could be the one that I love I could be the one that you dream of" +
                "A message in a bottle is all I can do Standin' here, hopin' it gets to you (It gets to you)" +
                "You could be the one that I keep, and I (Ah) I could be the reason you can't sleep at night (At)" +
                "A message in a bottle is all I can do Standin' here, hopin' it gets to you How is it in London? (London)" +
                "Where were you while I'm wonderin' (Wonderin') If I'll ever see you again? You could be the one that I love, mm-mm" +
                "And now I'm standin' here, hopin' it gets to you 'Cause you could be the one that I love (Yeah, yeah)" +
                "I could be the one that you dream of (Of) A message in a bottle is all I can do Standin' here, hopin' it gets to you (It gets to you)" +
                "You could be the one that I keep, and I I could be the reason you can't sleep at night (I can't sleep at night)" +
                "A message in a bottle is all I can do (Yeah, yeah) Standin' here, hopin' it gets to you (Yeah, yeah)" +
                "(Love) You could be the one that I love (Love) You could be the one that I love (Love) My love" +
                "And now I'm standin' here, hopin' this gets to you ";
        lyrics[25] = "3 AM and I'm still awake, I'll bet you're just fine Fast asleep in your city that's better than mine" +
                "And the girl in your bed has a fine pedigree And I'll bet your friends tell you she's better than me, huh" +
                "Well, I tried to fit in with your upper-crust circles Yeah, they let me sit in back when we were in love" +
                "Oh, they sit around talkin' about the meaning of life And the book that just saved 'em that I hadn't heard of" +
                "But now that we're done and it's over I bet you couldn't believe When you realized I'm harder to forget than I was to leave" +
                "And I bet you think about me You grew up in a silver-spoon gated community Glamorous, shiny, bright Beverly Hills" +
                "I was raised on a farm, no, it wasn't a mansion Just livin' room dancin' and kitchen table bills" +
                "But you know what they say, you can't help who you fall for And you and I fell like an early spring snow" +
                "But reality crept in, you said we're too different You laughed at my dreams, rolled your eyes at my jokes" +
                "Mr. Superior Thinkin' Do you have all the space that you need? I don't have to be your shrink to know that you'll never be happy" +
                "And I bet you think about me I bet you think about me, yes I bet you think about me Oh, block it all out" +
                "The voices so loud, sayin' \"Why did you let her go?\" Does it make you feel sad That the love that you're lookin' for" +
                "Is the love that you had? Now you're out in the world, searchin' for your soul Scared not to be hip, scared to get old" +
                "Chasing make-believe status, last time you felt free Was when none of that shit mattered 'cause you were with me" +
                "But now that we're done and it's over I bet it's hard to believe But it turned out I'm harder to forget than I was to leave" +
                "And, yeah, I bet you think about me I bet you think about me, yes I bet you think about me I bet you think about me when you're out" +
                "At your cool indie music concerts every week I bet you think about me in your house With your organic shoes and your million-dollar couch" +
                "I bet you think about me when you say \"Oh my god, she's insane, she wrote a song about me\" I bet you think about me";
        lyrics[26] = "He says he doesn't believe anything much he hears these days He says, \"Why fall in love, just so you can watch it go away?\"" +
                "He spends most of his nights wishing it was how it used to be He spends most of his flights getting pulled down by gravity" +
                "I call, just checkin' up on him He's up, 3AM, pacin' He says, \"It's not just a phase I'm in\"" +
                "My voice comes out beggin' All this time, I didn't know You were breakin' down I'd fall to pieces on the floor" +
                "If you weren't around Too young to know it gets better I'll be summer sun for you forever Forever winter if you go" +
                "He seems fine most of the time, forcing smiles and never minds His laugh is a symphony, when the lights go out, it's hard to breathe" +
                "I pull at every thread trying to solve the puzzles in his head Live my life scared to death he'll decide to leave instead" +
                "I call, just checkin' up on him He's up, 5AM, wasted Long gone, not even listening My voice comes out screamin'" +
                "All this time, I didn't know You were breakin' down I'd fall to pieces on the floor If you weren't around" +
                "Too young to know it gets better I'll be summer sun for you forever Forever winter if you go" +
                "If I was standing there in your apartment I'd take that bomb in your head and disarm it I'd say, \"I love you even at your darkest and" +
                "Please, don't go\" I didn't know You were breakin' down I'd fall to pieces on the floor If you weren't around" +
                "Too young to know it gets better I'll be summer sun for you forever Forever winter if you go" +
                "(Ooh, ooh, ooh) I'll be your summer sun forever (Ooh, ooh, ooh) At 3AM, pacin' All this time, I didn't know" +
                "(Ooh, ooh, ooh) At 5AM, wasted I'd be in pieces on the floor Forever winter if you go He says he doesn't believe anything much he hears these days" +
                "I say, \"Believe in one thing, I won't go away\"";
        lyrics[27] = "One, two, three, four Give me the keys, I'll bring the car back around We shouldn't be in this town" +
                "And my so-called friends, they don't know I'd drive away before I let you go So give me a reason and don't say no, no" +
                "There's a chain 'round your throat, piece of paper where I wrote \"I'll wait for you\" There's a key on the chain, there's a picture in a frame" +
                "Take it with you And run like you'd run from the law Darling, let's run Run from it all We can go where our eyes can take us" +
                "Go where no one else is, run Ooh, we'll run Ooh, we'll run Ooh, we'll run So you laugh like a child" +
                "And I'll sing like no one cares No one to be and no one to tell I could see this view a hundred times" +
                "Pale blue sky reflected in your eyes So give me a reason and don't say no, no And the note from the locket, you keep it in your pocket" +
                "Since I gave it to you There's a heart on your sleeve, I'll take it when I leave And hold it for you" +
                "And run like you'd run from the law Darling, let's run Run from it all We can go like they're trying to chase us" +
                "Go where no one else is, run Ooh, we'll run Ooh, we'll run Ooh, we'll run There's been this hole in my heart" +
                "This thing was a shot in the dark Say you'll never let 'em tear us apart And I'll hold onto you while we run" +
                "(And we run and we run and we run) Like you'd run from the law (And we run and we run and we run)" +
                "Darling, let's run (And we run and we run and we run) Run from it all (And we run and we run and we run)" +
                "We can go where our eyes can take us Go where no one else is, run Ooh, we'll run Ooh, we'll run" +
                "Ooh, we'll run Ooh, and we'll run ";
        lyrics[28] = "I wish I could fly I'd pick you up and we'd go back in time I'd write this in the sky I miss you like it was the very first night" +
                "And so it goes Every weekend, this same party I never go alone And I don't seem broken-hearted" +
                "My friends all say they know Everything I'm going through I drive down different roads But they all lead back to you" +
                "'Cause they don't know about the night in the hotel They weren't ridin' in the car when we both fell" +
                "Didn't read the note on the Polaroid picture They don't know how much I miss you I wish I could fly" +
                "I'd pick you up and we'd go back in time I'd write this in the sky I miss you like it was the very first night" +
                "And so it was We never saw it comin' Not trying to fall in love But we did like children runnin'" +
                "Back then, we didn't know We were built to fall apart We broke the status quo Then we broke each other's hearts" +
                "But don't forget about the night out in L.A Dance in the kitchen, chase me down through the hallway" +
                "No one knows about the words that we whispered No one knows how much I miss you I wish I could fly" +
                "I'd pick you up and we'd go back in time I'd write this in the sky I miss you like it was the very first night" +
                "Take me away, take me away Take me away to you, to you Take me away, take me away Take me away to you, to you" +
                "I remember the night at the hotel I was ridin' in the car when we both fell I'm the one on the phone as you whisper" +
                "\"Do you know how much I miss you?\" I wish that we could go back in time And I'd say to you \"I miss you like it was the very first night\"" +
                "I wish I could fly I'd pick you up and we'd go back in time I'd write this in the sky I miss you like it was the very first night" +
                "Take me away (Take me), take me away (Take me) Take me away (Take me) to you, to you Take me away (Take me), take me away (Take me)" +
                "Take me away (Take me) to you, to you ";

        //Everything in lowercase
        for(int j = 1; j <= tracksNumber; j++){
            lyrics[j]=lyrics[j].toLowerCase();
        }
    }

    public void search(String str, String[] solution){
        boolean redbool = false;
        for(int i = 1; i<=this.tracksNumber; i++){
            if(this.lyrics[i].contains(str)){
                if(redbool){
                    solution[1]+= ", "+this.titles[i];
                    solution[0]+= ", "+i;
                }else{
                    redbool= true;
                    solution[1]+= this.album+ ": "+this.titles[i];
                    solution[0]+= this.album+ ": "+ i;
                }
            }
        }
        solution[0]+="\n";
        solution[1]+="\n";
    }
}
