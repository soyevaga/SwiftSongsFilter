public class Evermore {
    //begins in 1, index 0 unused
    String[] lyrics;
    String[] titles;
    String album;
    int tracksNumber;

    public Evermore() {
        tracksNumber = 17;
        lyrics = new String[tracksNumber+1];
        album = "evermore";
        titles = new String[]{"", "willow", "champagne problems", "gold rush", "'tis the damn season",
                "tolerate it", "no body, no crime", "happiness", "dorothea", "coney island", "ivy",
                "cowboy like me", "long story short", "marjorie", "closure", "evermore", "right where you left me",
                "it's time to go"
        };
        lyrics[1] = "I'm like the water when your ship rolled in that night Rough on the surface, but you cut through like a knife" +
                "And if it was an open-shut case I never would've known from that look on your face Lost in your current like a priceless wine" +
                "The more that you say, the less I know Wherever you stray, I follow I'm begging for you to take my hand" +
                "Wreck my plans, that's my man Life was a willow and it bent right to your wind Head on the pillow, I could feel you sneakin' in" +
                "As if you were a mythical thing Like you were a trophy or a champion ring And there was one prize I'd cheat to win" +
                "The more that you say, the less I know Wherever you stray, I follow I'm begging for you to take my hand" +
                "Wreck my plans, that's my man You know that my train could take you home Anywhere else is hollow" +
                "I'm begging for you to take my hand Wreck my plans, that's my man Life was a willow and it bent right to your wind" +
                "They count me out time and time again Life was a willow and it bent right to your wind But I come back stronger than a '90s trend" +
                "Wait for the signal, and I'll meet you after dark Show me the places where the others gave you scars" +
                "Now this is an open-shut case I guess I should've known from the look on your face Every bait-and-switch was a work of art" +
                "The more that you say, the less I know Wherever you stray, I follow I'm begging for you to take my hand" +
                "Wreck my plans, that's my man You know that my train could take you home Anywhere else is hollow" +
                "I'm begging for you to take my hand Wreck my plans, that's my man The more that you say, the less I know" +
                "Wherever you stray, I follow I'm begging for you to take my hand Wreck my plans, that's my man" +
                "You know that my train could take you home Anywhere else is hollow I'm begging for you to take my hand" +
                "Wreck my plans, that's my man Hey, that's my man That's my man Yeah, that's my man Every bait-and-switch was a work of art" +
                "That's my man Hey, that's my man I'm begging for you to take my hand Wreck my plans, that's my man";
        lyrics[2] = "You booked the night train for a reason So you could sit there in this hurt Bustling crowds or silent sleepers" +
                "You're not sure which is worse Because I dropped your hand while dancing Left you out there standing" +
                "Crestfallen on the landing Champagne problems Your mom's ring in your pocket My picture in your wallet" +
                "Your heart was glass, I dropped it Champagne problems You told your family for a reason You couldn't keep it in" +
                "Your sister splashed out on the bottle Now no one's celebrating Dom Pérignon, you brought it" +
                "No crowd of friends applauded Your hometown skeptics called it Champagne problems You had a speech, you're speechless" +
                "Love slipped beyond your reaches And I couldn't give a reason Champagne problems Your Midas touch on the Chevy door" +
                "November flush and your flannel cure \"This dorm was once a madhouse\" I made a joke, \"Well, it's made for me\"" +
                "How evergreen, our group of friends Don't think we'll say that word again And soon they'll have the nerve to deck the halls" +
                "That we once walked through One for the money, two for the show I never was ready so I watch you go" +
                "Sometimes you just don't know the answer 'Til someone's on their knees and asks you \"She would've made such a lovely bride" +
                "What a shame she's fucked in the head,\" they said But you'll find the real thing instead She'll patch up your tapestry that I shred" +
                "And hold your hand while dancing Never leave you standing Crestfallen on the landing With champagne problems" +
                "Your mom's ring in your pocket Her picture in your wallet You won't remember all my Champagne problems" +
                "You won't remember all my Champagne problems ";
        lyrics[3] = "Gleaming, twinkling Eyes like sinking Ships on waters So inviting, I almost jump in But I don't like a gold rush, gold rush" +
                "I don't like anticipatin' my face in a red flush I don't like that anyone would die to feel your touch" +
                "Everybody wants you Everybody wonders what it would be like to love you Walk past, quick brush" +
                "I don't like slow motion, double vision in rose blush I don't like that falling feels like flying 'til the bone crush" +
                "Everybody wants you But I don't like a gold rush What must it be like to grow up that beautiful?" +
                "With your hair falling into place like dominoes I see me padding across your wooden floors With my Eagles T-shirt hanging from the door" +
                "At dinner parties, I call you out on your contrarian shit And the coastal town we wandered 'round had nеver seen a love as pure as it" +
                "And thеn it fades into the gray of my day-old tea 'Cause it could never be 'Cause I don't like a gold rush, gold rush" +
                "I don't like anticipatin' my face in a red flush I don't like that anyone would die to feel your touch" +
                "Everybody wants you Everybody wonders what it would be like to love you Walk past, quick brush" +
                "I don't like slow motion, double vision in rose blush I don't like that falling feels like flying 'til the bone crush" +
                "Everybody wants you But I don't like a gold rush What must it be like to grow up that beautiful?" +
                "With your hair falling into place like dominoes My mind turns your life into folklore I can't dare to dream about you anymore" +
                "At dinner parties, I won't call you out on your contrarian shit And the coastal town we never found will never see a love as pure as it" +
                "'Cause it fades into the gray of my day-old tea 'Cause it will never be Gleaming, twinkling Eyes like sinking" +
                "Ships on waters So inviting, I almost jump in ";
        lyrics[4] = "If I wanted to know who you were hanging with While I was gone, I would've asked you It's the kind of cold, fogs up windshield glass" +
                "But I felt it when I passed you There's an ache in you, put there by the ache in me But if it's all the same to you" +
                "It's the same to me So we could call it even You could call me \"babe\" for the weekend  'Tis the damn season, write this down" +
                "I'm stayin' at my parents' house And the road not taken looks real good now And it always leads to you and my hometown" +
                "I parkеd my car right between the Methodist And thе school that used to be ours The holidays linger like bad perfume" +
                "You can run, but only so far I escaped it too, remember how you watched me leave But if it's okay with you, it's okay with me" +
                "We could call it even You could call me \"babe\" for the weekend  'Tis the damn season, write this down" +
                "I'm stayin' at my parents' house And the road not taken looks real good now Time flies, messy as the mud on your truck tires" +
                "Now I'm missing your smile, hear me out We could just ride around And the road not taken looks real good now" +
                "And it always leads to you and my hometown Sleep in half the day just for old times' sake I won't ask you to wait if you don't ask me to stay" +
                "So I'll go back to L.A. and the so-called friends Who'll write books about me if I ever make it" +
                "And wonder about the only soul Who can tell which smiles I'm fakin' And the heart I know I'm breakin' is my own" +
                "To leave the warmest bed I've ever known We could call it even Even though I'm leaving And I'll be yours for the weekend" +
                " 'Tis the damn season We could call it even You could call me \"babe\" for the weekend  'Tis the damn season, write this down" +
                "I'm stayin' at my parents' house And the road not taken looks real good now Time flies, messy as the mud on your truck tires" +
                "Now I'm missing your smile, hear me out We could just ride around And the road not taken looks real good now" +
                "And it always leads to you and my hometown It always leads to you and my hometown ";
        lyrics[5] = "I sit and watch you readin' with your head low I wake and watch you breathin' with your eyes closed" +
                "I sit and watch you I notice everything you do or don't do You're so much older and wiser, and I" +
                "I wait by the door like I'm just a kid Use my best colors for your portrait Lay the table with the fancy shit" +
                "And watch you tolerate it If it's all in my head, tell me now Tell me I've got it wrong somehow" +
                "I know my love should be celebrated But you tolerate it I greet you with a battle hero's welcome" +
                "I take your indiscretions all in good fun I sit and listеn I polish plates until they gleam and glistеn" +
                "You're so much older and wiser, and I I wait by the door like I'm just a kid Use my best colors for your portrait" +
                "Lay the table with the fancy shit And watch you tolerate it If it's all in my head, tell me now" +
                "Tell me I've got it wrong somehow I know my love should be celebrated But you tolerate it While you were out buildin' other worlds, where was I?" +
                "Where's that man who'd throw blankets over my barbed wire? I made you my temple, my mural, my sky" +
                "Now I'm beggin' for footnotes in the story of your life Drawin' hearts in the byline Always takin' up too much space or time" +
                "You assume I'm fine, but what would you do if I (I) Break free and leave us in ruins? Took this dagger in me and removed it" +
                "Gain the weight of you, then lose it Believe me, I could do it If it's all in my head, tell me now" +
                "Tell me I've got it wrong somehow I know my love should be celebrated But you tolerate it I sit and watch you";
        lyrics[6] = "He did it He did it Este's a friend of mine We meet up every Tuesday night for dinner and a glass of wine" +
                "Este's been losin' sleep Her husband's actin' different and it smells like infidelity She says, \"That ain't my Merlot on his mouth" +
                "That ain't my jewelry on our joint account\" No, there ain't no doubt I think I'm gonna call him out" +
                "She says, \"I think he did it, but I just can't prove it\" I think he did it, but I just can't prove it" +
                "I think he did it, but I just can't prove it No, no body, no crime But I ain't lettin' up until the day I die" +
                "No, no I think he did it No, no He did it Este wasn't there Tuesday night at Olive Gardеn At her job or anywhere" +
                "Hе reports his missing wife And I noticed when I passed his house His truck has got some brand new tires" +
                "And his mistress moved in Sleeps in Este's bed and everything No, there ain't no doubt Somebody's gotta catch him out 'cause" +
                "I think he did it, but I just can't prove it (He did it) I think he did it, but I just can't prove it (He did it)" +
                "I think he did it, but I just can't prove it No, no body, no crime But I ain't lettin' up until the day I die" +
                "No, no I think he did it No, no He did it Good thing my daddy made me get a boating license when I was fifteen" +
                "And I've cleaned enough houses to know how to cover up a scene Good thing Este's sister's gonna swear she was with me (She was with me, dude)" +
                "Good thing his mistress took out a big life insurance policy They think she did it, but they just can't prove it" +
                "They think she did it, but they just can't prove it She thinks I did it, but she just can't prove it" +
                "No, no body, no crime I wasn't lettin' up until the day he No, no body, no crime I wasn't lettin' up until the day he" +
                "No, no body, no crime I wasn't lettin' up until the day he died ";
        lyrics[7] = "Honey, when I'm above the trees I see this for what it is But now I'm right down in it, all the years I've given" +
                "Is just shit we're dividin' up Showed you all of my hiding spots I was dancing when the music stopped" +
                "And in the disbelief, I can't face reinvention I haven't met the new me yet There'll be happiness after you" +
                "But there was happiness because of you Both of these things can be true There is happiness Past the blood and bruise" +
                "Past the curses and cries Beyond the terror in the nightfall Haunted by the look in my eyes That would've loved you for a lifetime" +
                "Leave it all behind And there is happiness Tell me, when did your winning smile Begin to look like a smirk?" +
                "When did all our lessons start to look like weapons Pointed at my deepest hurt? I hope she'll be a beautiful fool" +
                "Who takes my spot next to you No, I didn't mean that Sorry, I can't see facts through all of my fury" +
                "You haven't met the new me yet There'll be happiness after me But there was happiness because of me" +
                "Both of these things, I believe There is happiness In our history, across our great divide There is a glorious sunrise" +
                "Dappled with the flickers of light From the dress I wore at midnight, leave it all behind And there is happiness" +
                "I can't make it go away by making you a villain I guess it's the price I paid for seven years in Heaven" +
                "And I pulled your body into mine Every goddamn night, now I get fake niceties No one teaches you what to do" +
                "When a good man hurts you And you know you hurt him too Honey, when I'm above the trees I see it for what it is" +
                "But now my eyes leak acid rain on the pillow where you used to lay your head After giving you the best I had" +
                "Tell me what to give after that All you want from me now is the green light of forgiveness You haven't met the new me yet" +
                "And I think she'll give you that There'll be happiness after you But there was happiness because of you too" +
                "Both of these things can be true There is happiness In our history, across our great divide There is a glorious sunrise" +
                "Dappled with the flickers of light From the dress I wore at midnight, leave it all behind Oh, leave it all behind" +
                "Leave it all behind And there is happiness ";
        lyrics[8] = "Hey, Dorothea, do you ever stop and think about me? When we were younger, down in the park Honey, makin' a lark of the misery" +
                "You got shiny friends since you left town A tiny screen's the only place I see you now And I got nothin' but well wishes for ya" +
                "Ooh This place is the same as it ever was Ooh But you won't like it that way It's never too late to come back to my side" +
                "The stars in your eyes shined brighter in Tupelo And if you're ever tired of bеin' known for who you know" +
                "You know that you'll always know me Dorothea, uh-uh Dorothea, ah-ah Ooh You'rе a queen sellin' dreams, sellin' makeup and magazines" +
                "Ooh From you, I'd buy anything Hey, Dorothea, do you ever stop and think about me? When it was calmer, skippin' the prom" +
                "Just to piss off your mom and her pageant schemes And damn, Dorothea, they all wanna be ya But are you still the same soul I met under the bleachers? Well" +
                "Ooh I guess I'll never know Ooh And you'll go on with the show But it's never too late to come back to my side" +
                "The stars in your eyes shined brighter in Tupelo And if you're ever tired of bein' known for who you know" +
                "You know, you'll always know me Dorothea, uh-uh Dorothea, ah-ah Ooh, ooh Ooh-woo-ooh-ooh-ooh, ooh-ooh-ooh-ooh" +
                "Ooh, ooh Ooh-woo-ooh-ooh-ooh, ooh-ooh-ooh Dorothea (Ah-ah-ah) Ah-ah Ooh ";
        lyrics[9] = "Break my soul in two looking for you But you're right here If I can't relate to you anymore Then who am I related to?" +
                "And if this is the long haul How'd we get here so soon? Did I close my fist around something delicate?" +
                "Did I shatter you? And I'm sitting on a bench in Coney Island Wondering, where did my baby go?" +
                "The fast times, the bright lights, the merry go Sorry for not making you my centerfold Over and over" +
                "Lost again with no surprises Disappointments, close your eyes And it gets colder and colder When the sun goes down" +
                "The question pounds my head What's a lifetime of achievement If I pushed you to the edge But you were too polite to leave me?" +
                "And do you miss the rogue Who coaxed you into paradise and left you there? Will you forgive my soul" +
                "When you're too wise to trust me and too old to care? 'Cause we were like the mall before the internet" +
                "It was the one place to be The mischief, the gift-wrapped suburban dreams Sorry for not winning you an arcade ring" +
                "Over and over Lost again with no surprises Disappointments, close your eyes And it gets colder and colder" +
                "When the sun goes down Were you waiting at our old spot In the tree line by the gold clock Did I leave you hanging every single day?" +
                "Were you standing in the hallway With a big cake, happy birthday Did I paint your bluest skies the darkest grey?" +
                "A universe away And when I got into the accident The sight that flashed before me was your face" +
                "But when I walked up to the podium I think that I forgot to say your name I'm on a bench in Coney Island" +
                "Wondering, where did my baby go? The fast times, the bright lights, the merry go Sorry for not making you my centerfold" +
                "Over and over Lost again with no surprises Disappointments, close your eyes And it gets colder and colder" +
                "When the sun goes down When the sun goes down The sight that flashed before me was your face" +
                "When the sun goes down But I think that I forgot to say your name Over and over Sorry for not making you my, making you my" +
                "Making you my centerfold ";
        lyrics[10] = "How's one to know? I'd meet you where the spirit meets the bones In a faith-forgotten land In from the snow" +
                "Your touch brought forth an incandescent glow Tarnished but so grand And the old widow goes to the stone every day" +
                "But I don't, I just sit here and wait Grieving for the living Oh, goddamn My pain fits in the palm of your freezing hand" +
                "Taking mine, but it's been promised to another Oh, I can't Stop you putting roots in my dreamland" +
                "My house of stone, your ivy grows And now I'm covered in you I wish to know The fatal flaw that makes you long to be" +
                "Magnificently cursed He's in the room Your opal eyes are all I wish to see He wants what's only yours" +
                "Oh, goddamn My pain fits in the palm of your freezing hand Taking mine, but it's been promised to another" +
                "Oh, I can't Stop you putting roots in my dreamland My house of stone, your ivy grows And now I'm covered" +
                "Clover blooms in the fields Spring breaks loose, the time is near What would he do if he found us out?" +
                "Crescent moon, coast is clear Spring breaks loose, but so does fear He's gonna burn this house to the ground" +
                "How's one to know? I'd live and die for moments that we stole On begged and borrowed time So tell me to run" +
                "Or dare to sit and watch what we'll become And drink my husband's wine Oh, goddamn My pain fits in the palm of your freezing hand" +
                "Taking mine, but it's been promised to another Oh, I can't Stop you putting roots in my dreamland" +
                "My house of stone, your ivy grows And now I'm covered in you And I'm covered in you So yeah, it's a fire" +
                "It's a goddamn blaze in the dark And you started it You started it So yeah, it's a war It's the goddamn fight of my life" +
                "And you started it You started it Oh, I can't Stop you putting roots in my dreamland My house of stone, your ivy grows" +
                "And now I'm covered In you, in you Now I'm covered in you In you ";
        lyrics[11] = "And the tennis court was covered up With some tent-like thing And you asked me to dance But I said, \"Dancin' is a dangerous game\"" +
                "Oh, I thought This is gonna be one of those things Now I know I'm never gonna love again I've got some tricks up my sleeve" +
                "Takes one to know one You're a cowboy like me Never wanted love Just a fancy car Now I'm waiting by the phone" +
                "Like I'm sitting in an airport bar You had some tricks up your sleeve Takes one to know one You're a cowboy like me" +
                "Perched in the dark Tellin' all the rich folks anything they wanna hear Like it could be love" +
                "I could be the way forward Only if they pay for it You're a bandit like me Eyes full of stars" +
                "Hustling for the good life, never thought I'd meet you here It could be love We could be the way forward" +
                "And I know I'll pay for it You're a cowboy like me Perched in the dark Tellin' all the rich folks anything they wanna hear" +
                "Like it could be love I could be the way forward Only if they pay for it You're a bandit like me" +
                "Eyes full of stars Hustlin' for the good life, never thought I'd meet you here It could be love" +
                "We could be the way forward And I know I'll pay for it And the skeletons in both our closets" +
                "Plotted hard to fuck this up And the old men that I've swindled Really did believe I was the one" +
                "And the ladies lunchin' have their stories about When you passed through town Oh, but that was all before I locked it down" +
                "Now you hang from my lips Like the Gardens of Babylon With your boots beneath my bed Forever is the sweetest con" +
                "I've had some tricks up my sleeve Takes one to know one You're a cowboy like me And I'm never gonna love again" +
                "I'm never gonna love again I'm never gonna love again ";
        lyrics[12] = "Fatefully I tried to pick my battles 'til the battle picked me Misery Like the war of words I shouted in my sleep" +
                "And you passed right by I was in the alley, surrounded on all sides The knife cuts both ways" +
                "If the shoe fits, walk in it 'til your high heels break And I fell from the pedestal Right down the rabbit hole" +
                "Long story short, it was a bad time Pushed from the precipice Clung to the nearest lips Long story short, it was the wrong guy" +
                "Now I'm all about you I'm all about you, ah Yeah, yeah I'm all about you, ah Yeah, yeah Actually" +
                "I always felt I must look better in the rear view Missing me At the golden gates they once held the keys to" +
                "When I dropped my sword I threw it in the bushes and knocked on your door And we live in peace" +
                "But if someone comes at us, this time, I'm ready 'Cause I fell from the pedestal Right down the rabbit hole" +
                "Long story short, it was a bad time Pushed from the precipice Clung to the nearest lips Long story short, it was the wrong guy" +
                "Now I'm all about you I'm all about you, ah Yeah, yeah I'm all about you No more keepin' score" +
                "Now I just keep you warm (Keep you warm) No more tug of war Now I just know there's more (Know there's more)" +
                "No more keepin' score Now I just keep you warm (Keep you warm) And my waves meet your shore Ever and evermore" +
                "Past me I wanna tell you not to get lost in these petty things Your nemeses Will defeat themselves before you get the chance to swing" +
                "And he's passing by Rare as the glimmer of a comet in the sky And he feels like home If the shoe fits, walk in it everywhere you go" +
                "And I fell from the pedestal Right down the rabbit hole Long story short, it was a bad time Pushed from the precipice" +
                "Climbed right back up the cliff Long story short, I survived Now I'm all about you (And now) I'm all about you, ah" +
                "(And now) I'm all about you (And now) I'm all about you, ah Yeah, yeah I'm all about you (And now) Yeah, yeah" +
                "I'm all about you Long story short, it was a bad time Long story short, I survived ";
        lyrics[13] = "Never be so kind You forget to be clever Never be so clever You forget to be kind And if I didn't know better" +
                "I'd think you were talking to me now If I didn't know better I'd think you were still around" +
                "What died didn't stay dead What died didn't stay dead You're alive, you're alive in my head What died didn't stay dead" +
                "What died didn't stay dead You're alive, so alive Never be so politе You forget your power Nevеr wield such power" +
                "You forget to be polite And if I didn't know better I'd think you were listening to me now If I didn't know better" +
                "I'd think you were still around What died didn't stay dead What died didn't stay dead You're alive, you're alive in my head" +
                "What died didn't stay dead What died didn't stay dead You're alive, so alive The autumn chill that wakes me up" +
                "You loved the amber skies so much Long limbs and frozen swims You'd always go past where our feet could touch" +
                "And I complained the whole way there The car ride back and up the stairs I should've asked you questions" +
                "I should've asked you how to be Asked you to write it down for me Should've kept every grocery store receipt" +
                "'Cause every scrap of you would be taken from me Watched as you signed your name Marjorie All your closets of backlogged dreams" +
                "And how you left them all to me What died didn't stay dead What died didn't stay dead You're alive, you're alive in my head" +
                "What died didn't stay dead What died didn't stay dead You're alive, so alive And if I didn't know better" +
                "I'd think you were singing to me now If I didn't know better I'd think you were still around" +
                "I know better But I still feel you all around I know better But you're still around ";
        lyrics[14] = "It's been a long time And seeing the shape of your name Still spells out pain It wasn't right" +
                "The way it all went down Looks like you know that now Yes, I got your letter Yes, I'm doing better" +
                "It cut deep to know ya, right to the bone Yes, I got your letter Yes, I'm doing better I know that it's over, I don't need your" +
                "Closure, your closure Don't treat me like Some situation that needs to be handled I'm fine with my spite" +
                "And my tears and my beers and my candles I can feel you smoothing me over Yes, I got your letter" +
                "Yes, I'm doing bettеr It cut deep to know ya, right to the bone Yes, I got your lеtter Yes, I'm doing better" +
                "I know that it's over, I don't need your Closure, your closure Your closure, your closure I know I'm just a wrinkle in your new life" +
                "Staying friends would iron it out so nice Guilty, guilty, reaching out across the sea That you put between you and me" +
                "But it's fake and it's oh-so unnecessary Yes, I got your letter Yes, I'm doing better It cut deep to know ya, right to the bone" +
                "Yes, I got your letter Yes, I'm doing better I know that it's over, I don't need your Closure, closure, your closure" +
                "Your closure ";
        lyrics[15] = "Gray November I've been down since July Motion capture Put me in a bad light I replay my footsteps on each stepping stone" +
                "Trying to find the one where I went wrong Writing letters Addressed to the fire And I was catchin' my breath" +
                "Starin' out an open window, catchin' my death And I couldn't be sure I had a feeling so peculiar" +
                "That this pain would be for Evermore Hey, December Guess I'm feeling unmoored Can't remember What I used to fight for" +
                "I rewind thе tape, but all it does is pause On thе very moment all was lost Sending signals To be double-crossed" +
                "And I was catchin' my breath Barefoot in the wildest winter, catchin' my death And I couldn't be sure" +
                "I had a feeling so peculiar That this pain would be for Evermore (Evermore) Can't not think of all the cost" +
                "And the things that will be lost Oh, can we just get a pause? To be certain we'll be tall again" +
                "Whether weather be the frost Or the violence of the dog days I'm on waves, out being tossed Is there a line that I could just go cross?" +
                "And when I was shipwrecked (Can't think of all the cost now) I thought of you (All the things that will be lost now)" +
                "In the cracks of light (Can we just get a pause?) I dreamed of you (To be certain we'll be tall again)" +
                "(If you think of all the cost) It was real enough (Whether weather be the frost) To get me through (Or the violence of the dog days)" +
                "(Or the violence of the dog days) (Out on waves, being tossed) (I'm on waves, out being tossed)" +
                "But I swear (Is there a line that we can just go cross?) You were there And I was catchin' my breath" +
                "Floors of a cabin creakin' under my step And I couldn't be sure I had a feeling so peculiar This pain wouldn't be for" +
                "Evermore Evermore (Evermore) Evermore (Evermore) This pain wouldn't be for evermore Evermore[Chorus: Taylor Swift & Justin Vernon]" +
                "And I was catchin' my breath Floors of a cabin creakin' under my step And I couldn't be sure" +
                "I had a feeling so peculiar This pain wouldn't be for Evermore Evermore (Evermore) Evermore (Evermore)" +
                "This pain wouldn't be for evermore Evermore ";
        lyrics[16] = "Friends break up, friends get married Strangers get born, strangers get buried Trends change, rumors fly through new skies" +
                "But I'm right where you left me Matches burn after the other Pages turn and stick to each other" +
                "Wages earned and lessons learned But I, I'm right where you left me Help, I'm still at the restaurant" +
                "Still sitting in a corner I haunt Cross-legged in the dim light They say, \"What a sad sight,\" I" +
                "I swear you could hear a hair pin drop Right when I felt the moment stop Glass shattered on the white cloth" +
                "Everybody moved on, I, I stayed there Dust collected on my pinned-up hair They expected me to find somewhere" +
                "Some perspective, but I sat and stared right where You left me, you left me no, oh, you left me no" +
                "You left me no choice but to stay here forever You left me, you left me no, oh, you left me no" +
                "You left me no choice but to stay here forever Did you ever hear about the girl who got frozen?" +
                "Time went on for everybody else, she won't know it She's still twenty-three inside her fantasy" +
                "How it was supposed to be Did you hear about the girl who lives in delusion? Breakups happen every day, you don't have to lose it" +
                "She's still twenty-three inside her fantasy And you're sitting in front of me At the restaurant" +
                "When I was still the one you want Cross-legged in the dim light Everything was just right, I" +
                "I could feel the mascara run You told me that you met someone Glass shattered on the white cloth" +
                "Everybody moved on Help, I'm still at the restaurant Still sitting in a corner I haunt Cross-legged in the dim light" +
                "They say, \"What a sad sight,\" I, I stayed there Dust collected on my pinned-up hair I'm sure that you got a wife out there" +
                "Kids and Christmas, but I'm unaware 'cause I'm right where I cause no harm, mind my business" +
                "If our love died young, I can't bear witness, and it's been so long If you ever think you got it wrong, I'm right where" +
                "You left me, you left me no, oh, you left me no You left me no choice but to stay here forever" +
                "You left me, you left me no, oh, you left me no You left me no choice but to stay here forever";
        lyrics[17] = "When the dinner is cold and the chatter gets old You ask for the tab Or that moment again, he's insisting that friends" +
                "Look at each other like that When the words of a sister come back in whispers That prove she was not" +
                "In fact what she seemed, not a twin from your dreams She's a crook who was caught That old familiar body ache" +
                "The snaps from the same little breaks in your soul You know when it's time to go Twenty years at your job, then the son of the boss" +
                "Gets the spot that was yours Or trying to stay for the kids, when keeping it how it is Will only break their hearts worse" +
                "That old familiar body ache The snaps from the same little breaks in your soul You know when it's time to go" +
                "Sometimes, givin' up is the strong thing Sometimes, to run is the brave thing Sometimes, walkin' out is the one thing" +
                "That will find you the right thing Sometimes, givin' up is the strong thing Sometimes, to run is the brave thing" +
                "Sometimes, walkin' out is the one thing That will find you the right thing Fifteen years, fifteen million tears" +
                "Begging 'til my knees bled I gave it my all, he gave me nothin' at all Then wondered why I left" +
                "Now he sits on his throne in his palace of bones Praying to his greed He's got my past frozen behind glass" +
                "But I've got me That old familiar body ache The snaps from the same little breaks in my soul" +
                "I know when it's time to go Sometimes, givin' up is the strong thing Sometimes, to run is the brave thing" +
                "Sometimes, walkin' out is the one thing That will find you the right thing Sometimes, givin' up is the strong thing" +
                "Sometimes, to run is the brave thing Sometimes, walkin' out is the one thing That will find you the right thing" +
                "That will find you the right thing And you know in your soul And you know in your soul When it's time to go" +
                "And, well, you know, you know, you know, you know When it's time to go So then you go and then you go" +
                "You just go";

        //Everything in lowercase
        for(int j = 1; j <= tracksNumber; j++){
            lyrics[j]=lyrics[j].toLowerCase();
        }
    }

    public void search(String str, String[] solution){
        boolean evermorebool = false;
        for(int i = 1; i<=this.tracksNumber; i++){
            if(this.lyrics[i].contains(str)){
                if(evermorebool){
                    solution[1]+= ", "+this.titles[i];
                    solution[0]+= ", "+i;
                }else{
                    evermorebool= true;
                    solution[1]+= this.album+ ": "+this.titles[i];
                    solution[0]+= this.album+ ": "+ i;
                }
            }
        }
        solution[0]+="\n";
        solution[1]+="\n";
    }
}

