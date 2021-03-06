import { Term } from './../models/term';
import { AdditionalService } from './../models/additionalService';
import { AccommodationType } from './../models/accommodationType';
import { AccommodationCategory } from './../models/accommodationCategory';
import { PopulatedPlace } from './../models/populatedPlace';
import { Comment } from './../models/comment';
import { User } from '../user/user';

export class Accommodation {
    constructor(
    public name: string,
    public kapacitet: number,
    public naseljenomesto: PopulatedPlace,
    public opis: string,
    public image: string,
    public agent: User,
    public kategorija: AccommodationCategory,
    public accommodationType: AccommodationType,
    public terms: Array<Term>,
    public dodatneUsluge: Array<AdditionalService>,
    public komentari: Array<Comment>,
    public price = 0,
    public id?: string,



    ) {}


}
