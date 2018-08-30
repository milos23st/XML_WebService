import { Term } from './../models/term';
import { AdditionalService } from './../models/additionalService';
import { AccommodationType } from './../models/accommodationType';
import { AccommodationCategory } from './../models/accommodationCategory';
import { PopulatedPlace } from './../models/populatedPlace';
import { Comment } from './../models/comment';

export class Accommodation {
    constructor(
    public name: string,
    public kapacitet: number,
    public populatedPlace: PopulatedPlace,
    public description: string,
    public image: string,
    public accommodationCategory: AccommodationCategory,
    public accommodationType: AccommodationType,
    public terms: Array<Term>,
    public additionalServices: Array<AdditionalService>,
    public comments: Array<Comment>,
    public price = 0,
    public id?: string,



    ) {}


}
