import { Term } from './../models/term';
import { AdditionalService } from './../models/additionalService';
import { AccommodationType } from './../models/accommodationType';
import { AccommodationCategory } from './../models/accommodationCategory';
import { PopulatedPlace } from './../models/populatedPlace';

export class Accommodation {
    constructor(
    public name: string,
    public capacity: number,
    public populatedPlace: PopulatedPlace,

    public accommodationCategory: AccommodationCategory,
    public accommodationType: AccommodationType,
    public terms: Array<Term>,
    public additionalServices: Array<AdditionalService>,
    public price = 0,
    public id?: string

    ) {}


}