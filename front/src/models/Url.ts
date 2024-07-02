
export interface IUrlModel {
    url?: string;
}

export class UrlModel {
    url?: string;

    constructor({
        url = ''
    }: IUrlModel = {}) {
        this.url = url;
    }
}